package com.ciweek.myapplication;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.ciweek.myapplication.Model.Bean.Book;
import com.ciweek.myapplication.Utils.BitmapUtil;
import com.ciweek.myapplication.Utils.createReflectedImage;
import com.ciweek.myapplication.View.View.Activity.MainActivity;
import com.orhanobut.logger.Logger;

import java.util.List;

import static com.squareup.okhttp.internal.Internal.logger;
import static java.lang.System.load;

/**
 * Created by zhouqiang on 2017/6/8.
 */

//http://www.open-open.com/lib/view/open1462751945204.html

public class BookListAdapter extends PagerAdapter {
    private MainActivity context;
    private List<Book.DataEntity> bookData;
    private View view;


    public BookListAdapter(List<Book.DataEntity> bookData, MainActivity context) {
        this.bookData = bookData;
        this.context = context;

    }

    @Override
    public int getCount() {
        Logger.d("数据条数：" + bookData.size());
        if (bookData != null && bookData.size() > 0) {
            return bookData.size() - 1;
        } else {
            return 0;
        }

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(final ViewGroup container, int position) {




        if (bookData != null && bookData.size() > 0) {
            final String s = bookData.get(position).getBookPath() + bookData.get(position).getBookCover();


            view = View.inflate(context, R.layout.item, null);
            final ImageView imageview = (ImageView) view.findViewById(R.id.img_item);


              Glide.with(context).load(s).into(imageview);
//
//            Glide.with(context).asBitmap().load(s).into(new SimpleTarget<Bitmap>() {
//                @Override
//                public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
//
//                    if (resource != null) {
//                        Bitmap reflectedImage = new createReflectedImage().createReflectedImage(resource);
//                        imageview.setImageBitmap(reflectedImage);
//
//                        ViewGroup parent = (ViewGroup) view.getParent();
//                        if (parent != null) {
//                            parent.removeAllViews();
//                        }
//
//                        container.addView(view);
//
//                    }
//                }
//
//                {
//
//                }
//            });

//            ViewGroup parent = (ViewGroup) view.getParent();
//            if (parent != null) {
//                parent.removeAllViews();
//            }
//
             container.addView(view);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Bitmap bitmap1 = new BitmapUtil().returnBitmap(s);
//                final Bitmap reflectedImage = new createReflectedImage().createReflectedImage(bitmap1);
//
//                context.runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        imageview.setImageBitmap(reflectedImage);
//
//
//                        ViewGroup parent = (ViewGroup) imageview.getParent();
//                        if (parent != null) {
//                            parent.removeAllViews();
//                        }
//
//                        container.addView(imageview);
//                    }
//                });
//
//
//            }
//        }).start();

        }
        return view;

    }
}
