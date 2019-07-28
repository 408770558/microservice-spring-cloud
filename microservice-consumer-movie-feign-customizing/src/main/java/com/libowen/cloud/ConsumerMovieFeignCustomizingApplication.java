package com.libowen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 自定义feign属性
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class ConsumerMovieFeignCustomizingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieFeignCustomizingApplication.class, args);
    }

}
