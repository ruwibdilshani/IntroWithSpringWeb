package lk.ijse.introwithspringweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class DemoController {
//    @GetMapping(value = "/health")
//
//    public String healthCheck(){
//        return "DemoController run perfectly";
//    }

//    @GetMapping(value = "/healt?")

    @GetMapping(value = "/health/**")//ona taramak path danna plwn

    public String healthCheck(){
        return "DemoController run perfectly";
    }

    @GetMapping
    public String otherTest(){
        return "other Test";
    }
}
