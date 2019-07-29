package com.libowen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class GatewayZuulFallbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulFallbackApplication.class, args);
    }

}
