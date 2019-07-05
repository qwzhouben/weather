package com.zben.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Desc:天气响应
 * @Author: zhouben
 * @Date:2019/7/5 16:34
 */
@Data
public class WeatherResponse implements Serializable {
    private static final long serialVersionUID = 6664883712650587902L;
    private Weather data;
    private Integer status;
    private String desc;
}
