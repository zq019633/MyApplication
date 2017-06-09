package com.ciweek.myapplication.Model.Bean;

import java.util.List;

/**
 * Created by zhouqiang on 2017/6/6.
 */

public class Book {


    /**
     * isok : true
     * data : [{"bookNumber":1,"allbookNumber":631,"appStoreIAPID":"com.ciweek.book.631","publistDate":20170105,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20170105/"},{"bookNumber":21,"allbookNumber":627,"appStoreIAPID":"com.ciweek.book.627","publistDate":20161105,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20161105/"},{"bookNumber":20,"allbookNumber":626,"appStoreIAPID":"com.ciweek.book.626","publistDate":20161020,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20161020/"},{"bookNumber":19,"allbookNumber":625,"appStoreIAPID":"com.ciweek.book.625","publistDate":20161005,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20161005/"},{"bookNumber":18,"allbookNumber":624,"appStoreIAPID":"com.ciweek.book.624","publistDate":20160920,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160920/"},{"bookNumber":17,"allbookNumber":623,"appStoreIAPID":"com.ciweek.book.623","publistDate":20160905,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160905/"},{"bookNumber":16,"allbookNumber":622,"appStoreIAPID":"com.ciweek.book.622","publistDate":20160820,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160820/"},{"bookNumber":15,"allbookNumber":621,"appStoreIAPID":"com.ciweek.book.621","publistDate":20160805,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160805/"},{"bookNumber":14,"allbookNumber":620,"appStoreIAPID":"com.ciweek.book.620","publistDate":20160720,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160720/"},{"bookNumber":13,"allbookNumber":619,"appStoreIAPID":"com.ciweek.book.619","publistDate":20160705,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160705/"},{"bookNumber":12,"allbookNumber":618,"appStoreIAPID":"com.ciweek.book.618","publistDate":20160620,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160620/"},{"bookNumber":11,"allbookNumber":617,"appStoreIAPID":"com.ciweek.book.617","publistDate":20160605,"bookCover":"bookCover@2x.jpg","bookPages":74,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160605/"},{"bookNumber":10,"allbookNumber":616,"appStoreIAPID":"com.ciweek.book.616","publistDate":20160520,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160520/"},{"bookNumber":9,"allbookNumber":615,"appStoreIAPID":"com.ciweek.book.615","publistDate":20160505,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160505/"},{"bookNumber":8,"allbookNumber":614,"appStoreIAPID":"com.ciweek.book.614","publistDate":20160420,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160420/"},{"bookNumber":7,"allbookNumber":613,"appStoreIAPID":"com.ciweek.book.613","publistDate":20160405,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160405/"},{"bookNumber":6,"allbookNumber":612,"appStoreIAPID":"com.ciweek.book.612","publistDate":20160320,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160320/"},{"bookNumber":5,"allbookNumber":611,"appStoreIAPID":"com.ciweek.book.611","publistDate":20160305,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160305/"},{"bookNumber":4,"allbookNumber":610,"appStoreIAPID":"com.ciweek.book.610","publistDate":20160220,"bookCover":"bookCover@2x.jpg","bookPages":73,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160220/"},{"bookNumber":3,"allbookNumber":609,"appStoreIAPID":"com.ciweek.book.609","publistDate":20160205,"bookCover":"bookCover@2x.jpg","bookPages":74,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160205/"},{"bookNumber":2,"allbookNumber":608,"appStoreIAPID":"com.ciweek.book.608","publistDate":20160120,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160120/"},{"bookNumber":1,"allbookNumber":607,"appStoreIAPID":"com.ciweek.book.607","publistDate":20160105,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20160105/"},{"bookNumber":24,"allbookNumber":606,"appStoreIAPID":"com.ciweek.book.606","publistDate":20151220,"bookCover":"bookCover@2x.jpg","bookPages":108,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20151220/"},{"bookNumber":23,"allbookNumber":605,"appStoreIAPID":"com.ciweek.book.605","publistDate":20151205,"bookCover":"bookCover@2x.jpg","bookPages":72,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20151205/"},{"bookNumber":22,"allbookNumber":604,"appStoreIAPID":"com.ciweek.book.604","publistDate":20151120,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20151120/"},{"bookNumber":21,"allbookNumber":603,"appStoreIAPID":"com.ciweek.book.603","publistDate":20151105,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20151105/"},{"bookNumber":20,"allbookNumber":602,"appStoreIAPID":"com.ciweek.book.602","publistDate":20151020,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20151020/"},{"bookNumber":19,"allbookNumber":601,"appStoreIAPID":"com.ciweek.book.601","publistDate":20151005,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20151005/"},{"bookNumber":18,"allbookNumber":600,"appStoreIAPID":"com.ciweek.book.600","publistDate":20150920,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150920/"},{"bookNumber":17,"allbookNumber":599,"appStoreIAPID":"com.ciweek.book.5999","publistDate":20150905,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150905/"},{"bookNumber":16,"allbookNumber":598,"appStoreIAPID":"com.ciweek.book.598","publistDate":20150820,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150820/"},{"bookNumber":15,"allbookNumber":597,"appStoreIAPID":"com.ciweek.book.597","publistDate":20150805,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150805/"},{"bookNumber":14,"allbookNumber":596,"appStoreIAPID":"com.ciweek.book.596","publistDate":20150720,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150720/"},{"bookNumber":13,"allbookNumber":595,"appStoreIAPID":"com.ciweek.book.595","publistDate":20150705,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150705/"},{"bookNumber":12,"allbookNumber":594,"appStoreIAPID":"com.ciweek.book.594","publistDate":20150620,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150620/"},{"bookNumber":11,"allbookNumber":593,"appStoreIAPID":"com.ciweek.book.593","publistDate":20150605,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150605/"},{"bookNumber":10,"allbookNumber":592,"appStoreIAPID":"com.ciweek.book.592","publistDate":20150520,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150520/"},{"bookNumber":9,"allbookNumber":591,"appStoreIAPID":"com.ciweek.book.591","publistDate":20150505,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150505/"},{"bookNumber":8,"allbookNumber":590,"appStoreIAPID":"com.ciweek.book.590","publistDate":20150420,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150420/"},{"bookNumber":7,"allbookNumber":589,"appStoreIAPID":"com.ciweek.book.589","publistDate":20150405,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150405/"},{"bookNumber":6,"allbookNumber":588,"appStoreIAPID":"com.ciweek.book.588","publistDate":20150320,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150320/"},{"bookNumber":5,"allbookNumber":587,"appStoreIAPID":"com.ciweek.book.587","publistDate":20150305,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150305/"},{"bookNumber":34,"allbookNumber":585586,"appStoreIAPID":"com.ciweek.book.585586","publistDate":20150205,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150205/"},{"bookNumber":2,"allbookNumber":584,"appStoreIAPID":"com.ciweek.book.584","publistDate":20150120,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150120/"},{"bookNumber":1,"allbookNumber":583,"appStoreIAPID":"com.ciweek.book.583","publistDate":20150105,"bookCover":"bookCover@2x.jpg","bookPages":76,"bookPageFormat":"page_%03d.pdf","bigThumbFormat":"bt_%03d@2x.jpg","smallThumbFormat":"sm_%03d@2x.jpg","price":12,"priceUint":"RMB","priceUintSymbol":"￥","priceUintName":"元","freePreviewPages":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],"imagePages":[1,2,3,44],"bookPath":"http://api.enet.com.cn/ciweek/pdf/20150105/"}]
     */

    private boolean isok;
    private List<DataEntity> data;

    public boolean isIsok() {
        return isok;
    }

    public void setIsok(boolean isok) {
        this.isok = isok;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public static class DataEntity {
        /**
         * bookNumber : 1
         * allbookNumber : 631
         * appStoreIAPID : com.ciweek.book.631
         * publistDate : 20170105
         * bookCover : bookCover@2x.jpg
         * bookPages : 76
         * bookPageFormat : page_%03d.pdf
         * bigThumbFormat : bt_%03d@2x.jpg
         * smallThumbFormat : sm_%03d@2x.jpg
         * price : 12
         * priceUint : RMB
         * priceUintSymbol : ￥
         * priceUintName : 元
         * freePreviewPages : [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
         * imagePages : [1,2,3,44]
         * bookPath : http://api.enet.com.cn/ciweek/pdf/20170105/
         */

        private int bookNumber;
        private int allbookNumber;
        private String appStoreIAPID;
        private int publistDate;
        private String bookCover;
        private int bookPages;
        private String bookPageFormat;
        private String bigThumbFormat;
        private String smallThumbFormat;
        private int price;
        private String priceUint;
        private String priceUintSymbol;
        private String priceUintName;
        private String bookPath;
        private List<Integer> freePreviewPages;
        private List<Integer> imagePages;

        public int getBookNumber() {
            return bookNumber;
        }

        public void setBookNumber(int bookNumber) {
            this.bookNumber = bookNumber;
        }

        public int getAllbookNumber() {
            return allbookNumber;
        }

        public void setAllbookNumber(int allbookNumber) {
            this.allbookNumber = allbookNumber;
        }

        public String getAppStoreIAPID() {
            return appStoreIAPID;
        }

        public void setAppStoreIAPID(String appStoreIAPID) {
            this.appStoreIAPID = appStoreIAPID;
        }

        public int getPublistDate() {
            return publistDate;
        }

        public void setPublistDate(int publistDate) {
            this.publistDate = publistDate;
        }

        public String getBookCover() {
            return bookCover;
        }

        public void setBookCover(String bookCover) {
            this.bookCover = bookCover;
        }

        public int getBookPages() {
            return bookPages;
        }

        public void setBookPages(int bookPages) {
            this.bookPages = bookPages;
        }

        public String getBookPageFormat() {
            return bookPageFormat;
        }

        public void setBookPageFormat(String bookPageFormat) {
            this.bookPageFormat = bookPageFormat;
        }

        public String getBigThumbFormat() {
            return bigThumbFormat;
        }

        public void setBigThumbFormat(String bigThumbFormat) {
            this.bigThumbFormat = bigThumbFormat;
        }

        public String getSmallThumbFormat() {
            return smallThumbFormat;
        }

        public void setSmallThumbFormat(String smallThumbFormat) {
            this.smallThumbFormat = smallThumbFormat;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getPriceUint() {
            return priceUint;
        }

        public void setPriceUint(String priceUint) {
            this.priceUint = priceUint;
        }

        public String getPriceUintSymbol() {
            return priceUintSymbol;
        }

        public void setPriceUintSymbol(String priceUintSymbol) {
            this.priceUintSymbol = priceUintSymbol;
        }

        public String getPriceUintName() {
            return priceUintName;
        }

        public void setPriceUintName(String priceUintName) {
            this.priceUintName = priceUintName;
        }

        public String getBookPath() {
            return bookPath;
        }

        public void setBookPath(String bookPath) {
            this.bookPath = bookPath;
        }

        public List<Integer> getFreePreviewPages() {
            return freePreviewPages;
        }

        public void setFreePreviewPages(List<Integer> freePreviewPages) {
            this.freePreviewPages = freePreviewPages;
        }

        public List<Integer> getImagePages() {
            return imagePages;
        }

        public void setImagePages(List<Integer> imagePages) {
            this.imagePages = imagePages;
        }
    }
}
