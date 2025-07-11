package com.lloyd.springboot.myApp.common;


import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    public BasketballCoach(){

        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){

        return "Practice the dribbling for 10 minutes only";
    }
}
