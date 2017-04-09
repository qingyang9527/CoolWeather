package com.hm.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 清扬 on 2017/4/8.
 */

public class Province extends DataSupport {

    private int id;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    private String provinceName;//省名
    private int provinceCode;//省编码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
