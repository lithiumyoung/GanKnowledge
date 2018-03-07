package com.young.ganknowledge.gankCategory;

import android.util.Log;

import com.young.ganknowledge.GlobalConfig;
import com.young.ganknowledge.api.ApiManager;
import com.young.ganknowledge.base.BasePresenterImpl;
import com.young.ganknowledge.bean.GankCategoryBean;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lithiumyoung on 2017/6/15.
 */

public class GankCategoryPresenter extends BasePresenterImpl implements GankCategoryContract.IPresenter{

    private GankCategoryContract.IView mIView;

    private int mPage = 0;

    public GankCategoryPresenter(GankCategoryContract.IView iView) {
        mIView = iView;
    }

    @Override
    public void loadData(boolean isRefreshing) {

        if (isRefreshing) {
            return;
        } else {
            mIView.showDataLoading();
            mPage++;
        }

        Observable<GankCategoryBean> observable = ApiManager.getInstance()
                .getGankApi()
                .getGankCategoryData(mIView.getCategoryName(), GlobalConfig.GANK_CATEGORY_PAGE_SIZE, mPage);

        Subscription subscription = observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GankCategoryBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        mIView.hideDataLoading();
//                        mIView.showLoadDataError();
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(GankCategoryBean bean) {
                        mIView.hideDataLoading();
                        mIView.addData(bean);
                        mIView.refreshData();

                    }
                });
        addSubscription(subscription);
    }
}
