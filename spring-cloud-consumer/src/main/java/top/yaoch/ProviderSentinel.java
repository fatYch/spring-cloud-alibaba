package top.yaoch;

import org.springframework.stereotype.Component;

@Component
public class ProviderSentinel implements ProviderFeign {
    @Override
    public String getInfo() {
        return "我凉了，暂停服务!";
    }
}
