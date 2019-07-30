package com.libowen.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 手动刷新 localhost:8089/actuator/refresh
 * bus手动刷新地址 http://localhost:8089/actuator/bus-refresh
 * bus自动刷新 在github中添加Webhooks 每次push时自动触发一个http请求到http://localhost:8089/actuator/bus-refresh   需外网地址
 * @author Bowen.Li@onerway.com
 * @date 2019/7/30
 * 说明：
 */
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${example.property}")
    private String proFile;

    @GetMapping("getProFile")
    public String getProFile() {
        return proFile;
    }
}
