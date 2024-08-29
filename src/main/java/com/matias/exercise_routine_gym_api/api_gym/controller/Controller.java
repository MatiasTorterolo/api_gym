package com.matias.exercise_routine_gym_api.api_gym.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/home")
    public String home() {

        return "home";
    }

    
    @GetMapping("/detalis")
    public String details() {

        return "details";

    }
    
}
