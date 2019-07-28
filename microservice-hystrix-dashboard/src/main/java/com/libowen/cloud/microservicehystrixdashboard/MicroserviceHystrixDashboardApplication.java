package com.libowen.cloud.microservicehystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * hystrix仪表盘
 */
@EnableHystrixDashboard
@SpringBootApplication
public class MicroserviceHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceHystrixDashboardApplication.class, args);
    }

}
