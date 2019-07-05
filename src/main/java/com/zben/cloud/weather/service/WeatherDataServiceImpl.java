package com.zben.cloud.weather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zben.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @Desc: Weather Data Service
 * @Author: zhouben
 * @Date:2019/7/5 16:42
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    private static final String WEATHER_ID_URI = "http://wthrcdn.etouch.cn/weather_mini?citykey=";
    private static final String WEATHER_NAME_URI = "http://wthrcdn.etouch.cn/weather_mini?city=";

    @Autowired
    RestTemplate restTemplate;

    @Override
    public WeatherResponse getWeatherById(String id) {
        String uri = WEATHER_ID_URI + id;
        return getWeatherResponse(uri);
    }

    @Override
    public WeatherResponse getWeatherByName(String name) {
        String uri = WEATHER_NAME_URI + name;
        return getWeatherResponse(uri);
    }

    private WeatherResponse getWeatherResponse(String uri) {
        ResponseEntity<String> strRes = restTemplate.getForEntity(uri, String.class);

        String strBody = null;
        WeatherResponse response = null;
        if (strRes !=null && strRes.getStatusCodeValue() == 200) {
            strBody = strRes.getBody();
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            response = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
