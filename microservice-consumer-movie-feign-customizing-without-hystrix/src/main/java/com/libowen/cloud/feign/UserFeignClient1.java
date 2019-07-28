package com.libowen.cloud.feign;

import com.libowen.feignCustomizing.TestConfiguration2;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/26
 * 说明：
 */
@FeignClient(name = "xxxx", url = "http://127.0.0.1:8761/", configuration = TestConfiguration2.class, fallback = UserFeignClient1Fallback.class)
public interface UserFeignClient1 {

    @RequestMapping(value = "/eureka/apps/{serviceName}", method = RequestMethod.GET)
    String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);
}
