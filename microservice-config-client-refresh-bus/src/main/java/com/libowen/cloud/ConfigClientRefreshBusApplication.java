package com.libowen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConfigClientRefreshBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientRefreshBusApplication.class, args);
    }

}
