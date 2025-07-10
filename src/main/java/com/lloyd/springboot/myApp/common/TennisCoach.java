package com.lloyd.springboot.myApp.common;


import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Practice Reflex for 20 minutes";
    }
}
