package com.ciweek.myapplication.Base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

/**
 * Created by zhouqiang on 2017/6/6.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(getContentViewID());
        initView();

        initData();

        initListener();

    }

    protected abstract void initListener();


    //传递一个布局id
    protected abstract int getContentViewID() ;

    //初始化View
    protected abstract void initView();

    //初始化数据
    protected abstract void initData();


}
