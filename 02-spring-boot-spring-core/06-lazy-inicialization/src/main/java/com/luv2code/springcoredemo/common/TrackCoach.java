package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class TrackCoach implements Coach{
    public TrackCoach() {
        System.out.println("Constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "30 min running - TrackCoach";
    }
}
