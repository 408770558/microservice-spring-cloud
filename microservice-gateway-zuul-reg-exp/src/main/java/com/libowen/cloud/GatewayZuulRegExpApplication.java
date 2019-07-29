package com.libowen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class GatewayZuulRegExpApplication {

    /**
     * 正则匹配路由
     * serviceId“myusers-v1”将被映射到路由“/v1/myusers/**”
     */
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper() {
        return new PatternServiceRouteMapper(
                "(?<name>^.+)-(?<version>v.+$)",
                "${version}/${name}");
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulRegExpApplication.class, args);
    }

}
