package com.libowen.cloud.feign;

import com.libowen.cloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/26
 * 说明：
 */
@FeignClient("microservice-provider-user")
public interface UserFeignClient {

    /**
     * 路径带参数需要@PathVariable标记
     * mapping路径为服务提供方路径
     */
    @GetMapping(value = "user/simple/{id}")
    User findById(@PathVariable("id") Long id);
}
