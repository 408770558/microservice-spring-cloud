package com.libowen.cloud;

import com.libowen.cloud.filter.PreZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class GatewayZuulFilterApplication {

    @Bean
    public PreZuulFilter preZuulFilter(){
        return new PreZuulFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulFilterApplication.class, args);
    }

}
