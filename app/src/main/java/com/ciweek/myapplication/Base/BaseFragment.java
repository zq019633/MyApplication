package com.ciweek.myapplication.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zhouqiang on 2017/6/7.
 */

public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return getContentView();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        initView();
        initData();
        initListener();
    }

    protected abstract void initListener();




    //传递一个布局id
    protected abstract View getContentView() ;

    //初始化View
    protected abstract void initView();

    //初始化数据
    protected abstract void initData();


}
