package top.yaoch;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
public class SpringCloudMongodbApplication {

    @Autowired
    private MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMongodbApplication.class, args);
    }


    @GetMapping("put")
    public String put(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", UUID.randomUUID().toString());
        jsonObject.put("name", "张三");
        mongoTemplate.save(jsonObject, "test");
        return "ok";
    }

    @GetMapping("get")
    public String get(){
        return JSON.toJSONString(mongoTemplate.findAll(JSONObject.class, "test"));
    }


}
