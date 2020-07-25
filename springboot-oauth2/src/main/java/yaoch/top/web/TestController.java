package yaoch.top.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/")
public class TestController {

    @RequestMapping(value="order/demo")
    public String getDemo() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth);
        return "ok";
    }

    @PostMapping("/test")
    public String getTest(@RequestBody String a) {
        System.out.println(a);
        return "ok";
    }
}