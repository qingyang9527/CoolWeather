package com.hm.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 清扬 on 2017/4/8.
 */

public class HttpUtil {


    public static void sendOkHttpRequest(final String adress, Callback callback){
        OkHttpClient okHttpClient=new OkHttpClient();
        Request request=new Request.Builder().url(adress).build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}
