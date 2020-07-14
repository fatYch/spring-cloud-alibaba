package top.yaoch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * 资源配置
 * @author yaocanhong
 * @version 1.0.0
 * @data 2020/6/30 16:01
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId("resource-1");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/user/**").hasRole("user")   //role需要user角色
                .antMatchers("/order/**").hasAuthority("read")  //scope需要read权限
                .antMatchers("/test/**").permitAll()  //允许通过，无需鉴权
                .antMatchers("/oauth/**").permitAll()
                .anyRequest().authenticated();  //需要验证
    }

}
