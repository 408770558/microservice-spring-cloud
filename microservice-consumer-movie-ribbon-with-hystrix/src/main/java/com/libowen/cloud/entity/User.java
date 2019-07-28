package com.libowen.cloud.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/23
 * 说明：
 */
@Getter
@Setter
public class User {
    private long id;
    private String username;
    private String name;
    private Short age;
    private BigDecimal balance;
}
