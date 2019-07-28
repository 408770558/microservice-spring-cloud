package com.libowen.cloud.feign;

import com.libowen.cloud.entity.User;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/27
 * 说明：
 */
@Slf4j
@Component
public class UserFeignClient2FallbackFactory implements FallbackFactory<UserFeignClient2> {

    @Override
    public UserFeignClient2 create(Throwable cause) {
        log.info("fallback; reason was: {}", cause.getMessage());
        return new UserFeignClientWithFactory() {
            @Override
            public User findById(Long id) {
                User user = new User();
                user.setId(5L);
                return user;
            }
        };
    }
}
