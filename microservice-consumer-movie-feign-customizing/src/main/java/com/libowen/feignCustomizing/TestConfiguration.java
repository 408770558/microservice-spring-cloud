package com.libowen.feignCustomizing;

import feign.Contract;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 覆盖Feign默认值
 * @author Bowen.Li@onerway.com
 * @date 2019/7/26
 * 说明：
 */
@Configuration
public class TestConfiguration {

    @Value("eureka-user.name")
    private String user;

    @Value("eureka-user.password")
    private String password;

    /**
     * 修改Contract为feign默认方式，  修改后UserFeignClient接口了请求方式修改
     */
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(user, password);
    }

    /**
     * feign日志级别
     *
     * NONE，无记录（DEFAULT）。
     *
     * BASIC，只记录请求方法和URL以及响应状态代码和执行时间。
     *
     * HEADERS，记录基本信息以及请求和响应标头。
     *
     * FULL，记录请求和响应的头文件，正文和元数据。
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
