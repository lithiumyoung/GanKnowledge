package com.young.ganknowledge;

import android.app.Application;
import android.content.Context;

/**
 * Created by lithiumyoung on 2017/6/13.
 */

public class MyApplication extends Application {

    private static Context mContext;
    private static MyApplication INSTANCE;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        mContext = this;
    }

    public static Context getContext(){
        return mContext;
    }
}
