package com.libowen.cloud.controller;

import com.libowen.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://microservice-provider-user/user/simple/" + id, User.class);
    }

    /**
     * 负载测试
     *
     * @return
     */
    @GetMapping("test")
    public String test() {
        ServiceInstance s = loadBalancerClient.choose("microservice-provider-user");
        System.out.println("111 :" + s.getHost() + " : " + s.getPort() + " : " + s.getServiceId());

        ServiceInstance s1 = loadBalancerClient.choose("microservice-provider-user1");
        System.out.println("222 :" + s1.getHost() + " : " + s1.getPort() + " : " + s1.getServiceId());
        return "111";
    }
}
