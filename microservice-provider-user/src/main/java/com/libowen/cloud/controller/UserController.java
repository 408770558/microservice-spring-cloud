package com.libowen.cloud.controller;

import com.libowen.cloud.dao.UserMapping;
import com.libowen.cloud.entity.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/22
 * 说明：
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapping userMapping;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        Optional<User> user = userMapping.findById(id);
        return user.orElse(null);
    }

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("eureka-instance")
    public String serviceUrl() {
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER", false);
        return instance.getHomePageUrl();
    }
}
