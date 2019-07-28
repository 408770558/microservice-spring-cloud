package com.libowen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
// @EnableCircuitBreaker
public class ConsumerMovieFeignCustomizingWithoutHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieFeignCustomizingWithoutHystrixApplication.class, args);
    }

}
