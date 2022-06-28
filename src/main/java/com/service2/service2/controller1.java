package com.service2.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller1 {


    @GetMapping("/service2Call2")
    public String call2(){
        return "this is from service 2 call 2";
    }
    
}
