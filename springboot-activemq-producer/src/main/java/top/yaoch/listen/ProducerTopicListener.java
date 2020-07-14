package top.yaoch.listen;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 监听主题订阅队列
 * @author yaocanhong
 * @version 1.0.0
 * @data 2020/7/13 21:21
 */
@Component
public class ProducerTopicListener {
    @JmsListener(destination = "out.topic")
    public void consumerMessage(String text) {
        System.out.println("从out.topic队列收到的回复报文为:" + text);
    }

}
