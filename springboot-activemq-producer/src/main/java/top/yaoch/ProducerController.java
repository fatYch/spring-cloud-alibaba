package top.yaoch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @author yaocanhong
 * @version 1.0.0
 * @data 2020/7/13 21:17
 */

@RestController
public class ProducerController {

    //注入点对点的模式（Queue模式）
    @Autowired
    private Queue queue;

    //注入订阅模式（Topic）的消息
    @Autowired
    private Topic topic;

    //注入springboot封装的工具类
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;


    /**
     * 点对点模式（queue）模式发消息
     * @param text
     */
    @GetMapping("/queueSend")
    public String queueSend(String text) {
        //发送消息至消息中间件代理（Broker）
        jmsMessagingTemplate.convertAndSend(queue, text);
        return "success";
    }

    /**
     * 订阅模式（topic）发送消息
     * @param text
     * @return
     */
    @GetMapping("/topicSend")
    public String topicSend(String text){
        jmsMessagingTemplate.convertAndSend(topic,text);
        return "topic 发送成功";
    }

}
