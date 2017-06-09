package com.ciweek.myapplication.Utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;

import com.orhanobut.logger.Logger;

/**
 * Created by zhouqiang on 2017/6/8.
 */

public class createReflectedImage {
    public Bitmap createReflectedImage(Bitmap originalBitmap) {

        Logger.e("我是createReflectedImage");
// 图片与倒影间隔距离
        final int reflectionGap = 4;

// 图片的宽度
        int width = originalBitmap.getWidth();
// 图片的高度
        int height = originalBitmap.getHeight();

        Matrix matrix = new Matrix();
// 图片缩放，x轴变为原来的1倍，y轴为-1倍,实现图片的反转
        matrix.preScale(1, -1);
// 创建反转后的图片Bitmap对象，图片高是原图的一半。
        Bitmap reflectionBitmap = Bitmap.createBitmap(originalBitmap, 0,
                height / 2, width, height / 2, matrix, false);
// 创建标准的Bitmap对象，宽和原图一致，高是原图的1.5倍。
        Bitmap withReflectionBitmap = Bitmap.createBitmap(width, (height
                + height / 2 + reflectionGap), Bitmap.Config.ARGB_8888);

// 构造函数传入Bitmap对象，为了在图片上画图
        Canvas canvas = new Canvas(withReflectionBitmap);
// 画原始图片
        canvas.drawBitmap(originalBitmap, 0, 0, null);

// 画间隔矩形
        Paint defaultPaint = new Paint();
        canvas.drawRect(0, height, width, height + reflectionGap, defaultPaint);

// 画倒影图片
        canvas.drawBitmap(reflectionBitmap, 0, height + reflectionGap, null);

// 实现倒影效果
        Paint paint = new Paint();
        LinearGradient shader = new LinearGradient(0, originalBitmap.getHeight(),
                0, withReflectionBitmap.getHeight(), 0x70ffffff, 0x00ffffff,
                Shader.TileMode.MIRROR);
        paint.setShader(shader);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));

// 覆盖效果
        canvas.drawRect(0, height, width, withReflectionBitmap.getHeight(), paint);
        Logger.d("我返回的是bitmap");
        return withReflectionBitmap;
    }

//    public  Bitmap convertViewToBitmap(View view){
//        view.buildDrawingCache();
//        Bitmap bitmap = view.getDrawingCache();
//        return bitmap;
//    }





    public Bitmap getViewBitmap(View v) {
        v.clearFocus();
        v.setPressed(false);

        boolean willNotCache = v.willNotCacheDrawing();
        v.setWillNotCacheDrawing(false);

        // Reset the drawing cache background color to fully transparent
        // for the duration of this operation
        int color = v.getDrawingCacheBackgroundColor();
        v.setDrawingCacheBackgroundColor(0);

        if (color != 0) {
            v.destroyDrawingCache();
        }
        v.buildDrawingCache();
        Bitmap cacheBitmap = v.getDrawingCache();
        if (cacheBitmap == null) {
            Log.e("Folder", "failed getViewBitmap(" + v + ")", new RuntimeException());
            return null;
        }

        Bitmap bitmap = Bitmap.createBitmap(cacheBitmap);

        // Restore the view
        v.destroyDrawingCache();
        v.setWillNotCacheDrawing(willNotCache);
        v.setDrawingCacheBackgroundColor(color);

        return bitmap;
    }

    public  Bitmap convertViewToBitmap(View view) {
        view.destroyDrawingCache();
        view.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
                View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setDrawingCacheEnabled(true);
        return view.getDrawingCache(true);
    }

}


