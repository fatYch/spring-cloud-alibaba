package top.yaoch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class SpringbootActivemqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootActivemqConsumerApplication.class, args);
    }

}
