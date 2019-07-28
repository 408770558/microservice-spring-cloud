package com.libowen.cloud.feign;

import org.springframework.stereotype.Component;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/27
 * 说明：
 */
@Component
public class UserFeignClient1Fallback implements UserFeignClient1{
    @Override
    public String findServiceInfoFromEurekaByServiceName(String serviceName) {
        return "haha";
    }
}
