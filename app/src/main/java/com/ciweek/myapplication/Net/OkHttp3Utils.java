package com.ciweek.myapplication.Net;

import android.os.Environment;
import android.util.Log;

import com.ciweek.myapplication.MyApp;
import com.orhanobut.logger.Logger;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;


/**
 * Created by zhouqiang on 2017/6/6.
 */

public class OkHttp3Utils {

    private static OkHttpClient mOkHttpClient;

    //设置缓存目录
    private static File cacheDirectory = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "CiweekCache");
    private static Cache cache = new Cache(cacheDirectory, 10 * 1024 * 1024);

    /**
     * 获取OkHttpClient对象
     *
     * @return
     */
    public static OkHttpClient getOkHttpClient() {

        Logger.d(cacheDirectory);
        HttpLoggingInterceptor.Level level= HttpLoggingInterceptor.Level.BODY;
        //新建log拦截器
        HttpLoggingInterceptor loggingInterceptor=new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.i("OkHttpClient","OkHttpMessage:"+message);
            }
        });
        loggingInterceptor.setLevel(level);
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient
                .Builder();
        //OkHttp进行添加拦截器loggingInterceptor
        httpClientBuilder.addInterceptor(loggingInterceptor);

        if (null == mOkHttpClient) {
            mOkHttpClient = new OkHttpClient.Builder()
                    // .cookieJar(new CookiesManager())
                    .addInterceptor(loggingInterceptor)
                    //.addNetworkInterceptor(new CookiesInterceptor(MyApplication.getInstance().getApplicationContext()))
                    //设置请求读写的超时时间
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .cache(cache)
                    .build();
        }
        Logger.d(Environment.getExternalStorageDirectory().getAbsolutePath());
        return mOkHttpClient;
    }
}