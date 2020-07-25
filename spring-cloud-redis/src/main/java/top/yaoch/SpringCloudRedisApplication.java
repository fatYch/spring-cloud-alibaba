package top.yaoch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
public class SpringCloudRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRedisApplication.class, args);
    }

    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    @GetMapping("test")
    public String test(){
        String id = UUID.randomUUID().toString();
        redisTemplate.opsForValue().set(id, id);
        return redisTemplate.opsForValue().get(id);
    }

}
