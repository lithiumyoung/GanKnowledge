package com.young.ganknowledge.api;

import android.util.Log;

import com.young.ganknowledge.MyApplication;

import java.io.File;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lithiumyoung on 2017/6/13.
 */

public class ApiManager {

    private Object monitor = new Object();

    private static ApiManager apimaneger;

    private GankApi gankApi;

    private static File gankCacheFile;

    private ApiManager() {
    }

    public static ApiManager getInstance() {
        if (apimaneger == null) {
            synchronized (ApiManager.class) {
                if (apimaneger == null) {
                    apimaneger = new ApiManager();
//                    initFile();
                }
            }
        }
        return apimaneger;
    }

    private static void initFile() {
        gankCacheFile = new File(MyApplication.getContext().getCacheDir(), "gankCache");
        if (!gankCacheFile.exists()) {
            gankCacheFile.mkdirs();
        }

    }

//    private static Cache cache = new Cache(gankCacheFile, 10 * 1024 * 1024);

    private static OkHttpClient client = new OkHttpClient.Builder()
            .build();
//.cache(cache)

    public GankApi getGankApi() {
        if (gankApi == null) {
            synchronized (monitor) {
                if (gankApi == null) {
                    gankApi = new Retrofit.Builder()
                            .baseUrl("http://gank.io/api/")
                            .client(client)
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .build()
                            .create(GankApi.class);
                }
            }
        }
        return gankApi;
    }


}
