package com.young.ganknowledge.home;

import com.young.ganknowledge.api.ApiManager;
import com.young.ganknowledge.base.BasePresenterImpl;
import com.young.ganknowledge.bean.GankDayDataBean;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lithiumyoung on 2017/6/14.
 */

public class HomePresenter extends BasePresenterImpl implements HomeContract.IPresenter {

    private HomeContract.IView mHomeIView;

    public HomePresenter(HomeContract.IView homeIView){
        mHomeIView = homeIView;
    }

    @Override
    public void loadData() {

        ApiManager.getInstance().getGankApi().getGankDayData("2017","07","17")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GankDayDataBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(GankDayDataBean bean) {

                        mHomeIView.loadBeautyImage(bean.getResults().get福利().get(0).getUrl());

                    }
                });

    }

}
