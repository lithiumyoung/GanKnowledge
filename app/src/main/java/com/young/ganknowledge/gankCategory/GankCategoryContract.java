package com.young.ganknowledge.gankCategory;

import com.young.ganknowledge.base.IBasePresenter;
import com.young.ganknowledge.base.IBaseView;
import com.young.ganknowledge.bean.GankCategoryBean;

/**
 * Created by lithiumyoung on 2017/6/15.
 */

public class GankCategoryContract {

    interface IView extends IBaseView {
        String getCategoryName();

        void showLoadDataError();

        void showDataLoading();

        void hideDataLoading();

        void addData(GankCategoryBean bean);

        void refreshData();
    }

    interface IPresenter extends IBasePresenter {
        void loadData(boolean isRefreshing);
    }

}
