package com.lloyd.springboot.myApp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" return Hello World

    @GetMapping("/")
    public String sayHello(){
        return "Hello Lloyd!";
    }
    @GetMapping("/workout")
    public String getWorkout(){
        return "Nice Run!";
    }
}
