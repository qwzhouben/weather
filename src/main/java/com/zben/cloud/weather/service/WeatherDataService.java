package com.zben.cloud.weather.service;

import com.zben.cloud.weather.vo.WeatherResponse;

public interface WeatherDataService {

    public WeatherResponse getWeatherById(String id);

    public WeatherResponse getWeatherByName(String name);
}
