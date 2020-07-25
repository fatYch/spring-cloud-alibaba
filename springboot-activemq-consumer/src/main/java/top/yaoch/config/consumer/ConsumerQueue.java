package top.yaoch.config.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * 消息消費者(Queue模式)
 * @author yaocanhong
 * @version 1.0.0
 * @data 2020/7/13 21:47
 */
@Component
public class ConsumerQueue {
    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
    @JmsListener(destination = "ActiveMqQueue",containerFactory = "jmsListenerContainerQueue")
    @SendTo("out.queue")
    public String receiveQueue(String text) {
        System.out.println("消息消費者收到的报文为:"+text);
        return" queue---消息已经收到，over!";
    }


}

