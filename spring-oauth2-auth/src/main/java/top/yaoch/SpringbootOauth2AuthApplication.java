package top.yaoch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication

public class SpringbootOauth2AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOauth2AuthApplication.class, args);
    }

}
