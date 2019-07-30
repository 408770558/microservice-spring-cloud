package com.libowen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerAuthcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerAuthcApplication.class, args);
	}

}