package com.lloyd.springboot.myApp.common;


public class SwimCoach implements Coach {

    public SwimCoach(){

        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim a thousand meters as a warm-up";
    }
}
