package com.lloyd.springboot.myApp.common;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice jogging for 50 minutes :P";
    }
}
