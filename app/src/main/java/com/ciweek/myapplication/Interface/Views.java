package com.ciweek.myapplication.Interface;

import com.ciweek.myapplication.Model.Bean.Book;

import java.util.List;

/**
 * Created by zhouqiang on 2017/6/6.
 */

public interface Views {

    //展示杂志相关
    void showData(List<Book.DataEntity> bookData);

}
