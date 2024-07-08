package com.basic.pack.app.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {



    @GetMapping("/heartbeat")
    public String message(){
        return "Hi ! I am listening";
    }

    @PostMapping("/test")
    public void acceptMessage(@RequestBody String message){
        System.out.println(message);
    }
}
