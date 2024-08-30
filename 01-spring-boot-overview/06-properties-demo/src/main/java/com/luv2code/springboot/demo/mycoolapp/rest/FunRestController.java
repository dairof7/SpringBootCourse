package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${team.name}")
    private String teamName;
    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")
    public String sayHello(){
        return "Hola1";
    }


    @GetMapping("/team-info")
    public String teamInfo(){
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

}
