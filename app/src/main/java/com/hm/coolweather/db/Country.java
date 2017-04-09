package com.hm.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 清扬 on 2017/4/8.
 */

public class Country extends DataSupport {

    private int id;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    private String countryName;//县名
    private String weatherId;//县ID
    private int cityId;//城市ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
