package top.yaoch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ProviderFeign providerFeign;


    @GetMapping("/testByRest")
    public String testByRest(){
        return "消费者通过RestTemplate【" + restTemplate.getForObject("http://nacos-provider/getInfo", String.class) + "】";
    }

    @GetMapping("/testByFeign")
    public String testByFeign(){
        return "消费者通过Feign【" + providerFeign.getInfo() + "】";
    }


}
