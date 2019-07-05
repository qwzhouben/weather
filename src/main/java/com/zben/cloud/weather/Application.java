package com.zben.cloud.weather;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Desc:
 * @Author: zhouben
 * @Date:2019/7/5 16:19
 */
@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        log.info("Application startup...");
        SpringApplication.run(Application.class, args);
        log.info("Application start...");
    }
}
