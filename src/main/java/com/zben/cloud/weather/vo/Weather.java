package com.zben.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Desc:天气包装类
 * @Author: zhouben
 * @Date:2019/7/5 16:23
 */
@Data
public class Weather implements Serializable {

    private static final long serialVersionUID = 5064052360849742012L;
    private String ganmao;

    private String wendu;

    private String city;

    private String aqi;

    private Yesterday yesterday;

    private List<Forecast> forecast;
}
