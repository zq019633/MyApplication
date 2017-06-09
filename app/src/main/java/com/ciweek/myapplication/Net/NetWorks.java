package com.ciweek.myapplication.Net;



import com.ciweek.myapplication.Model.Bean.Book;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by zhouqiang on 2017/6/6.
 */
public class NetWorks extends RetrofitUtils {

    //创建实现接口调用
    protected static final NetService service = getRetrofit().create(NetService.class);

    //设缓存有效期为1天
    protected static final long CACHE_STALE_SEC = 60 * 60 * 24 * 1;
    //查询缓存的Cache-Control设置，使用缓存
    protected static final String CACHE_CONTROL_CACHE = "only-if-cached, max-stale=" + CACHE_STALE_SEC;
    //查询网络的Cache-Control设置。不使用缓存
    protected static final String CACHE_CONTROL_NETWORK = "max-age=0";


    private interface NetService {
        @GET("api.php")
       Observable<Book> getVerfcationGet(@Query("ac") String ac);

    }


   //这个请求是接口里的数据
    public static void verfacationCodeGet(String a, Observer<Book> observer) {
        setSubscribe(service.getVerfcationGet(a),observer);
    }




    public static <T> void setSubscribe(Observable<T> observable, Observer<T> observer) {
        observable.subscribeOn(Schedulers.io())
                .subscribeOn(Schedulers.newThread())//子线程访问网络
                .observeOn(AndroidSchedulers.mainThread())//回调到主线程
                .subscribe(observer);
    }
}