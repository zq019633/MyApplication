package com.ciweek.myapplication.View.View.Fragment;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.ciweek.myapplication.Base.BaseFragment;
import com.ciweek.myapplication.BookListAdapter;
import com.ciweek.myapplication.Interface.Views;
import com.ciweek.myapplication.Model.Bean.Book;
import com.ciweek.myapplication.MyApp;
import com.ciweek.myapplication.Presenter.BookListPresenter;
import com.ciweek.myapplication.R;
import com.ciweek.myapplication.Utils.BitmapUtil;
import com.ciweek.myapplication.Utils.FastBlurUtil;
import com.ciweek.myapplication.Utils.createReflectedImage;
import com.ciweek.myapplication.View.View.Activity.MainActivity;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import com.orhanobut.logger.Logger;
import com.zhy.magicviewpager.transformer.RotateYTransformer;
import com.zhy.magicviewpager.transformer.ScaleInTransformer;

import java.util.List;

/**
 * Created by zhouqiang on 2017/6/7.
 */

public class BookListFragment extends BaseFragment implements Views {

    private  List<Book.DataEntity> bookList;
    private MainActivity context;
    private View listFragment;

    private ImageView blurImage;
    private ViewPager blurViewPager;
    private ViewPager viewPager;
    private HorizontalInfiniteCycleViewPager viewpager;


    public BookListFragment(MainActivity mainActivity, List<Book.DataEntity> bookList) {
        this.context = mainActivity;
        this.bookList=bookList;
    }

    @Override
    protected View getContentView() {
        listFragment = listFragment.inflate(context, R.layout.list_fragment, null);

        return listFragment;
    }

    @Override
    protected void initView() {
        //viewpager = (HorizontalInfiniteCycleViewPager) context.findViewById(R.id.viewpager);
        //blurImage = (ImageView) context.findViewById(R.id.blurImage);

       viewPager = (ViewPager) context.findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(3);
//
           viewPager.setPageMargin(2);
//
    viewPager.setPageTransformer(true, new
           RotateYTransformer());
    }

    @Override
    protected void initData() {
//        BookListPresenter listPresenter = new BookListPresenter(BookListFragment.this);
//        listPresenter.GetNetWork();


        BookListAdapter bookListAdapter = new BookListAdapter(bookList, context);

        viewPager.setAdapter(new BookListAdapter(bookList, context));



        //blurViewPager.setAdapter(new BlurViewPagerAdapter(bookList,context));








    }




    @Override
    protected void initListener() {

    }


    @Override
    public void showData(final List<Book.DataEntity> bookData) {
//        Logger.d(bookData.get(1).getBookCover());
//
//        final String s = bookData.get(1).getBookPath() + bookData.get(1).getBookCover();
//
//
//
//        Logger.d("zqq:" + s);
//        //


    }


}
