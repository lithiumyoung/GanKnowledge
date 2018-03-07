package com.young.ganknowledge.api;

import com.young.ganknowledge.bean.GankCategoryBean;
import com.young.ganknowledge.bean.GankDayDataBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by lithiumyoung on 2017/6/13.
 */

public interface GankApi {

    @GET("data/{category}/{number}/{page}")
    Observable<GankCategoryBean> getGankCategoryData(@Path("category") String category, @Path("number") int number, @Path("page") int page);

    @GET("day/{year}/{month}/{day}")
    Observable<GankDayDataBean> getGankDayData(@Path("year") String year,@Path("month") String month,@Path("day") String day);


}
