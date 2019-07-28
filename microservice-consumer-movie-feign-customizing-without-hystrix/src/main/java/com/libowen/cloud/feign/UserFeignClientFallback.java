package com.libowen.cloud.feign;

import com.libowen.cloud.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/27
 * 说明：
 */
@Component
public class UserFeignClientFallback implements UserFeignClient{
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(5L);
        return user;
    }
}
