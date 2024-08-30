package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("Constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run for 20 minutes!! - Cricket";
    }

    @PostConstruct
    public void startUp() {
        System.out.println("in start up" + getClass().getSimpleName());
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("in clean up" + getClass().getSimpleName());
    }
}
