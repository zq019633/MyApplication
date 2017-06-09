package com.ciweek.myapplication.View.View.Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.ciweek.myapplication.Base.BaseActivity;

import com.ciweek.myapplication.Interface.Views;
import com.ciweek.myapplication.Model.Bean.Book;
import com.ciweek.myapplication.Presenter.MainPresenter;
import com.ciweek.myapplication.R;
import com.ciweek.myapplication.Utils.FastBlurUtil;
import com.ciweek.myapplication.Utils.SegmentedGroup;
import com.ciweek.myapplication.View.View.Fragment.BookListFragment;
import com.ciweek.myapplication.View.View.Fragment.BuyFragment;
import com.orhanobut.logger.Logger;

import java.util.List;

public class MainActivity extends BaseActivity implements Views, RadioGroup.OnCheckedChangeListener {


    private MainPresenter mainPresenter;
    private ImageView personal;
    private ImageView reload;
    private RadioButton all;
    private RadioButton buy;
    private SegmentedGroup segmentedGroup;
    private List<Book.DataEntity> bookList;
    private ImageView blurImage;


    @Override
    protected void initListener() {


        //顶部左边的按钮
        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "我被点击了", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                //Activity的进入和退出的方式
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });


        //顶部右边的按钮
        reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fragmentManager = MainActivity.this.getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.activity_main, new BookListFragment(MainActivity.this));
//                fragmentTransaction.commit();

                mainPresenter = new MainPresenter(MainActivity.this);
                mainPresenter.GetNetWork();
            }
        });


        segmentedGroup.setOnCheckedChangeListener(this);

    }

    @Override
    protected int getContentViewID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        personal = (ImageView) findViewById(R.id.personal);
        personal.setVisibility(View.VISIBLE);

        segmentedGroup = (SegmentedGroup) findViewById(R.id.segmented2);
        segmentedGroup.setVisibility(View.VISIBLE);


        reload = (ImageView) findViewById(R.id.reload);
        reload.setVisibility(View.VISIBLE);


        //顶部两个按钮的id
        all = (RadioButton) findViewById(R.id.all);
        buy = (RadioButton) findViewById(R.id.buy);


      //  blurImage = (ImageView) findViewById(R.id.blurImage);


    }

    @Override
    protected void initData() {

        mainPresenter = new MainPresenter(MainActivity.this);
        mainPresenter.GetNetWork();


        all.setChecked(true);
        //往首页的activity中添加一个fragment

    }

    @Override
    public void onClick(View v) {
    }

    //展示数据
    @Override
    public void showData(final List<Book.DataEntity> bookData) {


        Logger.e("我请求到了+++");
        bookList=bookData;

        FragmentManager fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.activity_main, new BookListFragment(MainActivity.this,bookList));
        fragmentTransaction.commit();

    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.all:
                reload.setVisibility(View.VISIBLE);
                FragmentManager fragmentManager = this.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.activity_main, new BookListFragment(MainActivity.this,bookList));
                fragmentTransaction.commit();
                break;
            case R.id.buy:
                reload.setVisibility(View.INVISIBLE);

                FragmentManager fragmentManager2 = this.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                fragmentTransaction2.replace(R.id.activity_main, new BuyFragment(MainActivity.this));
                fragmentTransaction2.commit();
                break;
        }
    }
}
