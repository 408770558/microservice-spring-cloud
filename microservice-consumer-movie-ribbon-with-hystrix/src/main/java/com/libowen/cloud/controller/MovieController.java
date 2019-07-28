package com.libowen.cloud.controller;

import com.libowen.cloud.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/23
 * 说明：
 */
@RestController
public class MovieController {

    @Resource
    private RestTemplate restTemplate;

    /**
     * commandProperties 将HystrixCommand的findById与findByIdFallback在同一线程里运行 hystrix抛异常时在配置即可
     */
    /*@GetMapping("/movie/{id}")
    @HystrixCommand(fallbackMethod = "findByIdFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.strategy", value = "SEMAPHORE")
    })
    public User findById(@PathVariable Long id) {
        try {
            Thread.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return restTemplate.getForObject("http://microservice-provider-user/user/simple/" + id, User.class);
    }

    public User findByIdFallback(Long id) {
        User user = new User();
        user.setId(5L);
        return user;
    }*/

   @GetMapping("/movie/{id}")
    @HystrixCommand(fallbackMethod = "findByIdFallback")
    public User findById(@PathVariable Long id) {
        // try {
        //     Thread.sleep(6);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        return restTemplate.getForObject("http://microservice-provider-user/user/simple/" + id, User.class);
    }

    public User findByIdFallback(Long id) {
        User user = new User();
        user.setId(5L);
        return user;
    }
}
