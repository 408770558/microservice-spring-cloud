package com.libowen.cloud.feign;

import com.libowen.feignCustomizing.TestConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/26
 * 说明：
 */
@FeignClient(name = "xxxx", url = "http://localhost:8761/", configuration = TestConfiguration.class)
public interface UserFeignClient1 {

    @RequestLine("GET /eureka/apps/{serviceName}")
    String findServiceInfoFromEurekaByServiceName(@Param("serviceName") String serviceName);
}
