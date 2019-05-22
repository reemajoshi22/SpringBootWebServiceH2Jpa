package com.learning.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan( basePackages = {"com.learning.springboot.main.domain"} )
//@Import({ Employee.class })
public class SpringBootMainClass {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMainClass.class,args);
    }
}

