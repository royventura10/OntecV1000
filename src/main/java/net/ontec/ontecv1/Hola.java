package net.ontec.ontecv1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hola {
    @RequestMapping("/")
    String hola(){
        return "holaPeru!";
    }
}
