package lk.ijse.introwithspringweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    //@GetMapping(value = "/health/**")//ona taramak path danna plwn

//    @GetMapping(value = "/pattern/{name}")
//    public String pathVariable(@PathVariable ("name")String name){
//        return "DemoController run perfectly with :"+name;
//
//}

    @GetMapping(value = "/health/{id:C\\d{3}}") //regex
    public String healthCheck(@PathVariable ("id")String id){
        return "DemoController run perfectly with :"+id;
    }


    @GetMapping
    public String otherTest(){
        return "other Test";
    }
}
