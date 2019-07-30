package com.libowen.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/30
 * 说明：
 */
@RestController
public class ConfigClientController {

    @Value("${example.property}")
    private String proFile;

    @GetMapping("getProFile")
    public String getProFile() {
        return proFile;
    }
}
