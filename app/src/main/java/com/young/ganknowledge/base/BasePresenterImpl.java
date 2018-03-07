package com.young.ganknowledge.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by lithiumyoung on 2017/6/14.
 */

public class BasePresenterImpl implements IBasePresenter{

    private CompositeSubscription mCompositeSubscription;

    @Override
    public void addSubscription(Subscription s) {
        if (this.mCompositeSubscription == null) {
            this.mCompositeSubscription = new CompositeSubscription();
        }
        this.mCompositeSubscription.add(s);
    }

    @Override
    public void unsubscribe() {
        if (this.mCompositeSubscription != null) {
            this.mCompositeSubscription.unsubscribe();
        }
    }
}
