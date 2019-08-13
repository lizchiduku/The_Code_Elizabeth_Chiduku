package com.codingdojo.thecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// Annotation
@RestController
public class TheCodeApplication {
     public static void main(String[] args) {
             SpringApplication.run(TheCodeApplication.class, args);
     }
}