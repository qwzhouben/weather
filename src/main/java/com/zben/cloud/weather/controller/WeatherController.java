package com.zben.cloud.weather.controller;

import com.zben.cloud.weather.service.WeatherDataService;
import com.zben.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc:
 * @Author: zhouben
 * @Date:2019/7/5 16:58
 */
@RequestMapping("/weather")
@RestController
public class WeatherController {

    @Autowired
    WeatherDataService weatherDataService;

    @RequestMapping("/cityId/{id}")
    public WeatherResponse getWeatherById(@PathVariable("id") String id) {
        return weatherDataService.getWeatherById(id);
    }

    @RequestMapping("/cityName/{name}")
    public WeatherResponse getWeatherByName(@PathVariable("name") String name) {
        return weatherDataService.getWeatherByName(name);
    }
}
