package com.ciweek.myapplication.Presenter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;

import android.util.Log;
import android.widget.Toast;

import com.ciweek.myapplication.CustomControls.LoadingDialog;
import com.ciweek.myapplication.Model.Bean.Book;
import com.ciweek.myapplication.Net.NetWorks;
import com.ciweek.myapplication.View.View.Activity.MainActivity;
import com.ciweek.myapplication.View.View.Fragment.BookListFragment;


import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.List;

import retrofit.HttpException;
import retrofit.http.HTTP;
import rx.Observer;

/**
 * Created by zhouqiang on 2017/6/7.
 */

public class BookListPresenter implements Presenter {


    private com.ciweek.myapplication.View.View.Fragment.BookListFragment BookListFragment;
    private List<Book.DataEntity> bookData;

    private LoadingDialog dialog1;
    private Context context;

    public BookListPresenter(com.ciweek.myapplication.View.View.Fragment.BookListFragment context) {
        this.BookListFragment = context;
    }

    @Override
    public void GetNetWork() {

        context = BookListFragment.getContext();
        dialog1 = new LoadingDialog(context, "玩命加载中...");
//显示Dialog
        dialog1.show();


        NetWorks.verfacationCodeGet("getList", new Observer<Book>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                dialog1.close();
                Log.e("zq", e.toString());
//                if(e instanceof UnknownHostException){
//                }else if(e instanceof SocketTimeoutException){
//                    Toast.makeText(context,"网络连接超时",Toast.LENGTH_SHORT).show();
//                }else if(e instanceof HttpException){
//                    HttpException httpException = (HttpException) e;
//                    int code = httpException.code();
//                    if(code>=500&&code<=505){
//                        Toast.makeText(context,"服务器繁忙",Toast.LENGTH_SHORT).show();
//                    }else if(code!=200) {
//                        Toast.makeText(context, "网络连接异常,请检查网络", Toast.LENGTH_SHORT).show();
//                    }
//
//                }
                Toast.makeText(context, "网络连接异常,请检查网络", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onNext(Book book) {
                Log.e("zq", "我请求到了");

                dialog1.close();


                bookData = book.getData();
                BookListFragment.showData(bookData);


            }
        });
    }
}
