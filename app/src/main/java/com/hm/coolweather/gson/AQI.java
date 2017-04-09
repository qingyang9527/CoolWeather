package com.hm.coolweather.gson;

/**
 * Created by 清扬 on 2017/4/9.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
