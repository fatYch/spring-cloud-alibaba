package top.yaoch.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaocanhong
 * @version 1.0.0
 * @data 2020/6/30 16:42
 */
@RestController
@Log4j2
public class TestController {

    @GetMapping("/user/{id}")
    public String user(@PathVariable("id")String id){
        log.info("需要user角色");
        return id;
    }

    @GetMapping("/order/{id}")
    public String order(@PathVariable("id")String id){
        log.info("需要read权限");
        return id;
    }

    @GetMapping("/test/{id}")
    public String test(@PathVariable("id")String id){
        log.info("不需要鉴权");
        return id;
    }







}
