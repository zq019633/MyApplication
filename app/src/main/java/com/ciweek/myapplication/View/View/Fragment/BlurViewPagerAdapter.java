package com.ciweek.myapplication.View.View.Fragment;

import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.ciweek.myapplication.Model.Bean.Book;
import com.ciweek.myapplication.Utils.FastBlurUtil;
import com.ciweek.myapplication.View.View.Activity.MainActivity;

import java.util.List;

/**
 * Created by zhouqiang on 2017/6/9.
 */
public class BlurViewPagerAdapter extends PagerAdapter {
    private final List<Book.DataEntity> bookList;
    private final MainActivity context
            ;
    private ImageView blurImage;

    public BlurViewPagerAdapter(List<Book.DataEntity> bookList, MainActivity context) {
    this.bookList=bookList;
        this.context=context;

    }

    @Override
    public int getCount() {
        return bookList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);

    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        blurImage = new ImageView(context);

        new Thread(new Runnable() {
            @Override
            public void run() {

                int scaleRatio = 0;
                if (TextUtils.isEmpty("8")) {
                    scaleRatio = 0;
                } else if (scaleRatio < 0) {
                    scaleRatio = 10;
                } else {
                    scaleRatio = Integer.parseInt("8");
                }

                //                        下面的这个方法必须在子线程中执行
                final Bitmap blurBitmap2 = FastBlurUtil.GetUrlBitmap(bookList.get(position).getBookPath()+bookList.get(position).getBookCover(), scaleRatio);

                //                        刷新ui必须在主线程中执行

                context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        blurImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        blurImage.setImageBitmap(blurBitmap2);
                    }
                });



            }
        }).start();

    container.addView(blurImage);

        return blurImage;
    }
}
