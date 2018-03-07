package com.young.ganknowledge.base;

import rx.Subscription;

/**
 * Created by lithiumyoung on 2017/6/14.
 */

public interface IBasePresenter {

    void addSubscription(Subscription s);

    void unsubscribe();

}
