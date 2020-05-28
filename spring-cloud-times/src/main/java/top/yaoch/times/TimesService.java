package top.yaoch.times;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import top.yaoch.times.entity.MeetingRoom;

import java.util.*;

@Service
@Log4j2
public class TimesService {

    private final static String[] TIMES = new String[]{
            "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30",
            "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30",
            "17:00", "17:30"
    };


    private static Map<String, int[]> companyMeeting = new HashMap<String, int[]>(){
        {
            put("6c3f84fe-ee8a-43d0-9774-b746507a81cf", new int[]{10, 11});
            put("7992214e-469a-4417-8dd9-f2e31e155883", new int[]{21, 31, 34, 35});
        }
    };

    @Value("${times.domain}")
    private String domain = "http://app.timesgroup.cn:8089";
    @Value("${times.api.queryMeetingRoom}")
    private String queryMeetingRoomApi = "/MeetingRoom/Ashx/MobileInterfaceHandler.ashx?action=N0163";


    public JSONArray queryMeetingRoom(String date){
        if(StringUtils.isEmpty(date)){
            date = DateUtil.formatDate(new Date());
        }
        JSONArray jsonArray = new JSONArray();
        for (Map.Entry<String, int[]> entry : companyMeeting.entrySet()){
            if (entry.getValue().length != 0){
                for (int floor : entry.getValue()){
                    jsonArray.addAll(queryMeetingRoom(entry.getKey(), floor, date));
                }
            }else {
                jsonArray.addAll(queryMeetingRoom(entry.getKey(), null, date));
            }
        }
        return jsonArray;
    }


    private JSONArray queryMeetingRoom(String companyId, Integer floor, String date){
        JSONArray jsonArray = new JSONArray();
        HttpRequest httpRequest = HttpUtil.createPost(domain + queryMeetingRoomApi);
        Map<String, String> headMap = new HashMap<>();
        headMap.put("Authorization", "Bearer559b16c3-916c-4ab1-9704-43119ebab661");
        httpRequest.addHeaders(headMap);
        JSONObject paramJson = new JSONObject(new LinkedHashMap<>());
        paramJson.put("UserId", "yaocanhong");
        paramJson.put("CompanyID", companyId);
        if (!StringUtils.isEmpty(floor)){
            paramJson.put("Floors", floor);
        }
        paramJson.put("PageNo", 1);
        paramJson.put("PageSize", 30);
        paramJson.put("StartDate", date);
        paramJson.put("EndDate", date);
        httpRequest.form("args",paramJson.toJSONString());
        MeetingRoom meetingRoom = JSON.parseObject(httpRequest.execute().body()).toJavaObject(MeetingRoom.class);
        //解析
        for (MeetingRoom.ResultBean.DataBean dataBean : meetingRoom.getResult().getData()){
            //log.info(JSON.toJSONString(dataBean));
            JSONObject jsonObject = new JSONObject(new LinkedHashMap<>());
            jsonObject.put("名称", dataBean.getMeetingRoomName());
            jsonObject.put("楼层", dataBean.getFloors());
            jsonObject.put("类型", dataBean.getCategoryName());
            jsonObject.put("功能", dataBean.getApplianceName());
            jsonObject.put("可预约时间", dealTime(dataBean.getAvailableTime()));
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }


    private String dealTime(List<String> times){
        if (CollectionUtil.isEmpty(times)){
            return "08:30 — 18:00";
        }
        //格式化时间
        List<String> timeList = new ArrayList<>();
        for (String time : times){
            timeList.add(time.split(",")[0]);
        }
        //log.info("当前被预定的时间:" + JSON.toJSONString(timeList));
        //选出未被预定的
        StringBuilder stringBuilder = new StringBuilder();
        boolean startFlag = false;
        for (String a: TIMES){
            if (!timeList.contains(a)){
                if(!startFlag) {
                    stringBuilder.append("【").append(a);
                    startFlag = true;
                }
            }else {
                if (startFlag){
                    stringBuilder.append("—").append(a).append("】");
                    startFlag = false;
                }
            }
        }
        if (stringBuilder.length() == 0){
            return "当前无时间可预约!";
        }
        return stringBuilder.toString();
    }




    public static void main(String[] args) {
        (new TimesService()).queryMeetingRoom(null);
        //log.info(DateUtil.formatDate(new Date()));
    }




}
