package com.ciweek.myapplication.Net;


import okhttp3.OkHttpClient;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by zhouqiang on 2017/6/6.
 */

public class RetrofitUtils {

    //服务器路径
    //http://api.enet.com.cn/provider/Public/Cms/index.php?service=Applist.index
    private static final String API_SERVER = "http://api.enet.com.cn/ciweek/";
    private static Retrofit mRetrofit;
    private static OkHttpClient mOkHttpClient;


    /**
     * 获取Retrofit对象
     *
     * @return
     */
    protected static Retrofit getRetrofit() {

        if (null == mRetrofit) {

            if (null == mOkHttpClient) {
                mOkHttpClient = OkHttp3Utils.getOkHttpClient();
            }
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(API_SERVER + "/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return mRetrofit;
    }


}
