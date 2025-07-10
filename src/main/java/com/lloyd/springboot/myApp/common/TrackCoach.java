package com.lloyd.springboot.myApp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Go sprinting to enhance your agility for 25 minutes";
    }
}
