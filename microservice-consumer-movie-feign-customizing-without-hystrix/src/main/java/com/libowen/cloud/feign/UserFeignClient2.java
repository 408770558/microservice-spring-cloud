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
@FeignClient(name = "aaaaa", configuration = TestConfiguration.class, fallbackFactory = UserFeignClient2FallbackFactory.class)
public interface UserFeignClient2 {

    @RequestLine("GET /user/simple/{id}")
    User findById(@Param("id") Long id);
}
