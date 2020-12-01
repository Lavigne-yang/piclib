package com.yc.piclib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApp_gitHub_01 {

    public static void main(String[] args) {

        SpringApplication.run(ConfigApp_gitHub_01.class, args);
    }
}
