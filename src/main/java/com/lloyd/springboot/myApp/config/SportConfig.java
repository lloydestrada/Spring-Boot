package com.lloyd.springboot.myApp.config;

//Configuration Bean

import com.lloyd.springboot.myApp.common.Coach;
import com.lloyd.springboot.myApp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
