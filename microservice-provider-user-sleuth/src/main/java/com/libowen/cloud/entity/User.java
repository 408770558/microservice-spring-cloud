package com.libowen.cloud.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/22
 * 说明：
 */
@Getter
@Setter
@Entity
@Table(name = "user")
public class User implements Serializable {

    //SpringBoot的@GeneratedValue 是不需要加参数的,但是如果数据库控制主键自增(auto_increment), 不加参数就会报错
    // -AUTO主键由程序控制, 是默认选项 ,不设置就是这个
    // -IDENTITY 主键由数据库生成, 采用数据库自增长, Oracle不支持这种方式
    // -SEQUENCE 通过数据库的序列产生主键, MYSQL  不支持
    // -Table 提供特定的数据库产生主键, 该方式更有利于数据库的移植
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private Short age;

    @Column
    private BigDecimal balance;
}
