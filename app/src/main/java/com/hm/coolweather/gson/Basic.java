package com.hm.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 清扬 on 2017/4/9.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
