package com.libowen.cloud.controller;

import com.libowen.cloud.entity.User;
import com.libowen.cloud.feign.UserFeignClient;
import com.libowen.cloud.feign.UserFeignClient1;
import com.libowen.cloud.feign.UserFeignClient2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/23
 * 说明：
 */
@RestController
public class MovieController {

    @Resource
    private UserFeignClient userFeignClient;
    @Resource
    private UserFeignClient1 userFeignClient1;
    @Resource
    private UserFeignClient2 userFeignClient2;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClient.findById(id);
    }

    @GetMapping("/getServiceName/{serviceName}")
    public String getServiceName(@PathVariable String serviceName) {
        return userFeignClient1.findServiceInfoFromEurekaByServiceName(serviceName);
    }

    @GetMapping("/getById/{id}")
    public User getById(@PathVariable Long id) {
        return userFeignClient2.findById(id);
    }
}
