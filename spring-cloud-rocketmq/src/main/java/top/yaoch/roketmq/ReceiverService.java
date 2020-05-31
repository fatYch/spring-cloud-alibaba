package top.yaoch.roketmq;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ReceiverService {

    @StreamListener("input1")
    public void receiveInput1(String receiveMsg) {
        log.info("input1 接收到了消息：" + receiveMsg);
    }

    @StreamListener("input2")
    public void receiveInput2(String receiveMsg) {
        log.info("input2 接收到了消息：" + receiveMsg);
    }

//    @StreamListener("input3")
//    public void receiveInput3(@Payload Foo foo) {
//        log.info("input3 接收到了消息：" + foo);
//    }
}
