package top.yaoch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
public class SpringOauth2ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOauth2ResourceApplication.class, args);
    }

}
