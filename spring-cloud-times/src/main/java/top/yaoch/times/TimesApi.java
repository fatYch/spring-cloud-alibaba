package top.yaoch.times;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("times")
public class TimesApi {

    @Autowired
    private TimesService timesService;

    @GetMapping("queryMeetingRoom")
    public JSONArray queryMeetingRoom(String date){
        return timesService.queryMeetingRoom(date);
    }


}
