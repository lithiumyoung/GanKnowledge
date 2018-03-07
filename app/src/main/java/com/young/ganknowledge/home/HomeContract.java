package com.young.ganknowledge.home;

import com.young.ganknowledge.base.BasePresenterImpl;
import com.young.ganknowledge.base.IBasePresenter;
import com.young.ganknowledge.base.IBaseView;

/**
 * Created by lithiumyoung on 2017/6/14.
 */

public class HomeContract {

    interface IView extends IBaseView {
        void refreshData();

        void loadBeautyImage(String url);
    }

    interface IPresenter extends IBasePresenter {

        void loadData();


    }

}
