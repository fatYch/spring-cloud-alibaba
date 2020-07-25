package top.yaoch.listen;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 *  监听消费者的反馈（Queue模式）
 * @author yaocanhong
 * @version 1.0.0
 * @data 2020/7/13 21:20
 */

@Component
public class ProducerListener {

    @JmsListener(destination = "out.queue")
    public void consumerMessage(String text) {
        System.out.println("从out.queue队列收到的回复报文为:" + text);
    }

    @JmsListener(destination = "out.topic", containerFactory = "jmsListenerContainerTopic")
    public void consumerTopicMessage(String text) {
        System.out.println("从out.topic队列收到的回复报文为:" + text);
    }
}

