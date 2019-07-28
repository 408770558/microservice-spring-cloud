package com.libowen.feignCustomizing;

import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/27
 * 说明：
 */
@Configuration
public class TestConfiguration2 {

    @Value("eureka-user.name")
    private String user;

    @Value("eureka-user.password")
    private String password;

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(user, password);
    }

    /**
     * 单个禁用hystrix
     *
     * 将Feign.Builder feignBuilder：HystrixFeign.Builder  改为 Feign.builder
     */
    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
