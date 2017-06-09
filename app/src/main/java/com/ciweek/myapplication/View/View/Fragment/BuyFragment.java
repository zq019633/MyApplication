package com.ciweek.myapplication.View.View.Fragment;

import android.support.v4.app.Fragment;
import android.view.View;

import com.ciweek.myapplication.Base.BaseFragment;
import com.ciweek.myapplication.MyApp;
import com.ciweek.myapplication.R;
import com.ciweek.myapplication.View.View.Activity.MainActivity;

/**
 * Created by zhouqiang on 2017/6/7.
 */

public class BuyFragment extends BaseFragment {

    private  MainActivity context;
    private View buyFragment;

    public BuyFragment(MainActivity mainActivity) {
        this.context=mainActivity;

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected View getContentView() {
        buyFragment = View.inflate(context, R.layout.buy_fragment,null);
        return buyFragment;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}
