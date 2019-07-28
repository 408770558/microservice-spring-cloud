package com.libowen.cloud.dao;

import com.libowen.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/22
 * 说明：
 */
@Repository
public interface UserMapping extends JpaRepository<User, Long> {
}
