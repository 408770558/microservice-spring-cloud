package com.libowen.cloud.feign;

import com.libowen.cloud.entity.User;
import com.libowen.feignCustomizing.TestConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/26
 * 说明：
 */
@FeignClient(name = "microservice-provider-user", configuration = TestConfiguration.class)
public interface UserFeignClient {

    /**
     * 路径带参数需要@PathVariable标记
     * mapping路径为服务提供方路径
     */
    @RequestLine("GET /user/simple/{id}")
    User findById(@Param("id") Long id);
}
