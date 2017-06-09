package com.ciweek.myapplication.Presenter;

import android.util.Log;

import com.ciweek.myapplication.CustomControls.LoadingDialog;
import com.ciweek.myapplication.Model.Bean.Book;
import com.ciweek.myapplication.Net.NetWorks;
import com.ciweek.myapplication.View.View.Activity.MainActivity;

import java.util.List;

import rx.Observer;

/**
 * Created by zhouqiang on 2017/6/6.
 */

public class MainPresenter implements Presenter {
    //传递过来的activity的引用  这样 Presenter里就可以进行一些相关的操作
    private MainActivity View;
    private List<Book.DataEntity> bookData;
    private LoadingDialog dialog;
    private LoadingDialog dialog1;

    public MainPresenter(MainActivity mainActivity) {
        this.View = mainActivity;
    }

    //请求网络
    @Override
    public void GetNetWork() {

        dialog1 = new LoadingDialog(View, "玩命加载中...");
//显示Dialog
        dialog1.show();


        NetWorks.verfacationCodeGet("getList", new Observer<Book>() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                Log.e("zq", e.toString());
            }

            @Override
            public void onNext(Book book) {
                Log.e("zq", "我请求到了");


                dialog1.close();


                bookData = book.getData();
                View.showData(bookData);





            }
        });

    }
}
