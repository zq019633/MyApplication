package com.ciweek.myapplication.View.View.Activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ciweek.myapplication.Base.BaseActivity;
import com.ciweek.myapplication.R;

/**
 * Created by zhouqiang on 2017/6/6.
 */
public class AboutActivity extends BaseActivity {

    private ImageView ivBack;
    private TextView book;
    private TextView aboutPersonal;

    @Override
    protected void initListener() {
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    protected int getContentViewID() {
        return R.layout.personal;
    }

    @Override
    protected void initView() {
        ivBack = (ImageView) findViewById(R.id.back);
        ivBack.setVisibility(View.VISIBLE);
        book = (TextView) findViewById(R.id.book);
        book.setVisibility(View.VISIBLE);

        aboutPersonal = (TextView) findViewById(R.id.aboutPersonal);
        aboutPersonal.setVisibility(View.VISIBLE);

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {


    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }


    /**
     * Created by zhouqiang on 2017/6/6.
     */

    public static class SplshActivity extends BaseActivity {
        @Override
        protected void initListener() {

        }

        @Override
        protected int getContentViewID() {
            return 0;
        }

        @Override
        protected void initView() {

        }

        @Override
        protected void initData() {

        }

        @Override
        public void onClick(View v) {

        }
    }
}
