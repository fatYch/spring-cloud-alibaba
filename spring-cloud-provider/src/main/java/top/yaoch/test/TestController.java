package top.yaoch.test;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//支持热更新，nacos的配置文件改变，跟着改变
@RefreshScope
@Log4j2
public class TestController {

    @Value( "${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String serverName;
    @Value("${user.name}")
    private String userName;
    @Autowired
    private TestService testService;


    @GetMapping("/test1")
    public String test1(){
        return testService.hello(1000);
    }

    @GetMapping("/test2")
    public String test2(){
        return testService.hello(1000);
    }

    @GetMapping({"/getInfo"})
    public String getInfo(){
        log.info("测试资源点：" + testService.hello(1000));
        return serverName + ":" + port;
    }
}
