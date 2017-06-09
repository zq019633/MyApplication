package com.ciweek.myapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by zhouqiang on 2017/6/6.
 */

public  class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    private static Context mContext;

    /**获取Context.
     * @return
     */
    public static Context getContext(){
        return mContext;
    }

}
