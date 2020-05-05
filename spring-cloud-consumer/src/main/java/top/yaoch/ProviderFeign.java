package top.yaoch;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "nacos-provider", fallback = ProviderSentinel.class)
public interface ProviderFeign {

    @GetMapping("/getInfo")
    String getInfo();

}
