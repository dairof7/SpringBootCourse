package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("Constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "30 min running - tennis";
    }
}
