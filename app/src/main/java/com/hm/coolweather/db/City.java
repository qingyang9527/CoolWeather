package com.hm.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 清扬 on 2017/4/8.
 */

public class City extends DataSupport {

    private int id;
    private String cityName;//城市名
    private int cityCode;//城市编码
    private int provinceId;//省份ID

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
