package com.young.ganknowledge.home;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.young.ganknowledge.GlobalConfig;
import com.young.ganknowledge.MyApplication;
import com.young.ganknowledge.R;
import com.young.ganknowledge.gankCategory.CategoryFragment;
import com.young.ganknowledge.ui.BaseActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity implements HomeContract.IView{

    @BindView(R.id.home_viewpager)
    ViewPager mViewPager;
    @BindView(R.id.home_tablayout)
    TabLayout mTabLayout;
    @BindView(R.id.home_beauty_iv)
    ImageView mBeautyIV;

    private CategoryFragment androidFragment;
    private CategoryFragment iosFragment;
    private CategoryFragment frontEndFragment;
    private CategoryFragment appFragment;
    private CategoryFragment resourceFragment;
    private CategoryFragment recommendFragment;

    private HomeVPAdapter homeVPAdapter;

    public HomePresenter mHomePresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);

        initView();

        initData();


    }

    private void initView() {

        mHomePresenter = new HomePresenter(this);

        String[] titles = {GlobalConfig.CATEGORY_NAME_ANDROID,
                GlobalConfig.CATEGORY_NAME_IOS,
                GlobalConfig.CATEGORY_NAME_FRONT_END,
                GlobalConfig.CATEGORY_NAME_APP,
                GlobalConfig.CATEGORY_NAME_RESOURCE,
                GlobalConfig.CATEGORY_NAME_RECOMMEND};

        androidFragment = CategoryFragment.newInstance(titles[0]);
        iosFragment = CategoryFragment.newInstance(titles[1]);
        frontEndFragment = CategoryFragment.newInstance(titles[2]);
        appFragment = CategoryFragment.newInstance(titles[3]);
        resourceFragment = CategoryFragment.newInstance(titles[4]);
        recommendFragment = CategoryFragment.newInstance(titles[5]);

        homeVPAdapter = new HomeVPAdapter(getSupportFragmentManager());
        homeVPAdapter.setTitles(titles);

        homeVPAdapter.addFragment(androidFragment);
        homeVPAdapter.addFragment(iosFragment);
        homeVPAdapter.addFragment(frontEndFragment);
        homeVPAdapter.addFragment(appFragment);
        homeVPAdapter.addFragment(resourceFragment);
        homeVPAdapter.addFragment(recommendFragment);

        mViewPager.setAdapter(homeVPAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }

    private void initData() {
        mHomePresenter.loadData();
    }

    @Override
    public void refreshData() {
        homeVPAdapter.notifyDataSetChanged();
    }

    @Override
    public void loadBeautyImage(String url) {
        Glide.with(MyApplication.getContext()).load(url)
                .error(R.mipmap.ic_launcher)
                .crossFade(200)
                .into(mBeautyIV);
    }
}
