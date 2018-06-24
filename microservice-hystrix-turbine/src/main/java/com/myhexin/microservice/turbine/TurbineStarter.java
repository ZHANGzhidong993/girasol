package com.myhexin.microservice.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class TurbineStarter {
    public static void main(String[] args) {
        SpringApplication.run(TurbineStarter.class);
    }
}
