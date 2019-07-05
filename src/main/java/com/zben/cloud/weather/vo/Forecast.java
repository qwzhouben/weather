package com.zben.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Desc:未来天气
 * @Author: zhouben
 * @Date:2019/7/5 16:27
 */
@Data
public class Forecast implements Serializable {
    private static final long serialVersionUID = 8433304828374429109L;
    //"date": "5日星期五",
    //                "high": "高温 32℃",
    //                "fengli": "<![CDATA[<3级]]>",
    //                "low": "低温 27℃",
    //                "fengxiang": "无持续风向",
    //                "type": "多云"
    private String date;
    private String high;
    private String fengli;
    private String low;
    private String fengxiang;
    private String type;
}
