package com.basic.pack.app.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.basic.pack.app.demo.service.TennisRankingService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DemoController {

    @Autowired
    private TennisRankingService tennisRankingService;



    @GetMapping("/heartbeat")
    public String message(){
        return "Hi ! I am listening";
    }

    @PostMapping("/test")
    public void acceptMessage(@RequestBody String message){
        System.out.println(message);
    }
    @GetMapping("/get-tennis-ranking")
    public ResponseEntity<?> callRapidApiForTennisRankingData() {

        return new ResponseEntity<>(tennisRankingService.getTennisRankingData(), HttpStatus.OK);

    }
}
