package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesDcb3CApplication {

    public static void main(String[] args) {

        SpringApplication.run(MicroservicesDcb3CApplication.class, args);

    }

}