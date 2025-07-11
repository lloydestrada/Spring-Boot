package com.lloyd.springboot.myApp.rest;


import com.lloyd.springboot.myApp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private field for dependency
    private Coach myCoach;

    //add another field
    //private Coach anotherCoach;


    /*Define a constructor for dependency injection
    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }*/


    /*Setter injection
    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }*/

    //Implementing Qualifiers
    @Autowired
    public DemoController(
            @Qualifier("aquatic") Coach theCoach)
           //@Qualifier("trackCoach") Coach theAnotherCoach
            {

        System.out.println("In Constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        //anotherCoach = theAnotherCoach;
    }

    /*@Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    /*@GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }*/
}
