package top.yaoch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringbootActivemqProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootActivemqProducerApplication.class, args);
    }

}
