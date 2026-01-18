package com.test.exercise.controller;

import com.test.exercise.processor.CodingTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.ObjectMapper;

import java.io.Console;
@RestController
public class FrontController {
    @Autowired
    CodingTest codingTest;
    @GetMapping("/home")
    public String getHomePage(){
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(codingTest);
        return json;
    }
}
