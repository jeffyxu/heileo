package com.jeffy.heileo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientHeileoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientHeileoApplication.class, args);
    }

}
