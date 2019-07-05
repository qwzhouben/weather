package com.zben.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Desc:昨日天气
 * @Author: zhouben
 * @Date:2019/7/5 16:27
 */
@Data
public class Yesterday implements Serializable {
    private static final long serialVersionUID = -6128453498426179428L;
    //"date": "4日星期四",
    //            "high": "高温 32℃",
    //            "fx": "无持续风向",
    //            "low": "低温 27℃",
    //            "fl": "<![CDATA[<3级]]>",
    //            "type": "阵雨"
    private String date;
    private String high;
    private String fx;
    private String low;
    private String fl;
    private String type;
}
