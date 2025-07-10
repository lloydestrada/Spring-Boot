package com.lloyd.springboot.myApp.common;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Practice Reflex for 20 minutes";
    }
}
