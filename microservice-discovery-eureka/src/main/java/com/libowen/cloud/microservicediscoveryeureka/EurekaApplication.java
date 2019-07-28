package com.libowen.cloud.microservicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

    /**
     * 由于默认是开启CSRF，所以需要将其关闭，不然会出现如下错误：
     *
     * javax.ws.rs.WebApplicationException: com.fasterxml.jackson.databind.exc.MismatchedInputException: Root name 'timestamp' does not match expected ('instance') for type
     * [simple type, class com.netflix.appinfo.InstanceInfo]
     */
    @EnableWebSecurity
    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            //Howard 2019-03-20,错误的做法：
            //http.csrf().disable();//这样会直接取消验证账号密码了
            //Howard 2019-03-20，注意 正确的做法是这样：            
            http.csrf().disable().authorizeRequests()
                    .anyRequest()
                    .authenticated()
                    .and()
                    .httpBasic();
        }

    }
}
