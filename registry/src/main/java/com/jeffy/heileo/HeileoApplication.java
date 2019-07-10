package com.jeffy.heileo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HeileoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeileoApplication.class, args);
    }

}
