package com.libowen.cloud.controller;

import com.libowen.cloud.feign.UserFeignClient;
import com.libowen.cloud.entity.User;
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

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClient.findById(id);
    }
}
