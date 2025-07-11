package com.lloyd.springboot.myApp.common;

/*import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;*/
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TrackCoach implements Coach{


    public TrackCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    /*//define init method
    @PostConstruct
    public void startUp(){
        System.out.println("In do my startup: " + getClass().getSimpleName());
    }
    //define pre-destroy method
    @PreDestroy
    public void preDestroy(){
        System.out.println("do the preDestroy: " + getClass().getSimpleName());
    }*/

    @Override
    public String getDailyWorkout() {
        return "Go sprinting to enhance your agility for 25 minutes";
    }
}
