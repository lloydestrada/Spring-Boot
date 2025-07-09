package com.lloyd.springboot.myApp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //injecting custom properties name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoints for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){

        return  "Coach: " + coachName +  "\nTeam Name: " + teamName;
    }

    //expose "/" return Hello World
    @GetMapping("/")
    public String sayHello(){
        return "Hello Lloyd!";
    }
    @GetMapping("/workout")
    public String getWorkout(){
        return "Nice Run!";
    }

    @GetMapping("/funds")
    public String getFunds(){
        return "You do not have any funds!";
    }

    @GetMapping("/Profile")
    public String getProfile(){

        return "This is my profile";
    }

}
