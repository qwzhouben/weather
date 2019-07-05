package com.zben.cloud.weather.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Desc:
 * @Author: zhouben
 * @Date:2019/7/5 17:02
 */
@Configuration
public class RestConfiguration {

    @Autowired
    RestTemplateBuilder builder;

    @Bean
    public RestTemplate restTemplate() {
        return builder.build();
    }
}
