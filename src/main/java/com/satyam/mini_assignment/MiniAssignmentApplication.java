package com.satyam.mini_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MiniAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniAssignmentApplication.class, args);
    }

}
