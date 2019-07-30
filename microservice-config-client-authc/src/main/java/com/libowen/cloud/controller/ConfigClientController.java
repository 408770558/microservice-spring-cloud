package com.libowen.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/30
 * 说明：
 */
@RefreshScope//手动刷新 localhost:8089/actuator/refresh
@RestController
public class ConfigClientController {

    @Value("${example.property}")
    private String proFile;

    @GetMapping("getProFile")
    public String getProFile() {
        return proFile;
    }
}
