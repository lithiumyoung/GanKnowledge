package com.young.ganknowledge.gankCategory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.young.ganknowledge.MyApplication;
import com.young.ganknowledge.R;
import com.young.ganknowledge.bean.GankCategoryBean;
import com.young.ganknowledge.home.HomeActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lithiumyoung on 2017/6/15.
 */

public class CategoryFragment extends Fragment implements GankCategoryContract.IView, SwipeRefreshLayout.OnRefreshListener {


    public static final String CATEGORY_NAME = "category_name";

    private String categoryName;

    @BindView(R.id.gank_category_swipe_refresh_layout)
    SwipeRefreshLayout mSwipeRefreshLayout;
    @BindView(R.id.gank_category_recycler_view)
    RecyclerView mRecyclerView;

    private List<GankCategoryBean.ResultsBean> mList;

    private GankCategoryRVAdapter mRVAdapter;

    private GankCategoryContract.IPresenter mPresenter = new GankCategoryPresenter(this);

    private int iconWidth;


    public static CategoryFragment newInstance(String categoryName) {
        Bundle args = new Bundle();

        CategoryFragment fragment = new CategoryFragment();
        args.putString(CATEGORY_NAME,categoryName);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            categoryName = getArguments().getString(CATEGORY_NAME);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_vp, container, false);
        ButterKnife.bind(this,view);

        initView();

        initAdapter();

        mPresenter.loadData(false);

        return view;
    }

    private void initView() {
        mSwipeRefreshLayout.setColorSchemeResources(
                R.color.colorSwipeRefreshLayout1,
                R.color.colorSwipeRefreshLayout2,
                R.color.colorSwipeRefreshLayout3,
                R.color.colorSwipeRefreshLayout4,
                R.color.colorSwipeRefreshLayout5
        );
        mSwipeRefreshLayout.setOnRefreshListener(this);

        iconWidth = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 80f, getResources().getDisplayMetrics());

        mList = new ArrayList();
    }

    private void initAdapter() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(MyApplication.getContext(),LinearLayoutManager.VERTICAL,false));
        mRVAdapter = new GankCategoryRVAdapter();
        mRecyclerView.setAdapter(mRVAdapter);
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public void showLoadDataError() {
        Toast.makeText(getContext(), "数据加载失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDataLoading() {
        mSwipeRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideDataLoading() {
        mSwipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void addData(GankCategoryBean bean) {
        mList.addAll(bean.getResults());
    }

    @Override
    public void refreshData() {
        ((HomeActivity)getActivity()).refreshData();
        mRVAdapter.notifyDataSetChanged();
    }

    @Override
    public void onRefresh() {
        mPresenter.loadData(false);
    }

    public class GankCategoryRVAdapter extends RecyclerView.Adapter<GankCategoryRVAdapter.GankCategoryHolder> {

        @Override
        public GankCategoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MyApplication.getContext()).inflate(R.layout.gank_category_rv_item, parent, false);
            return new GankCategoryHolder(view);
        }

        @Override
        public void onBindViewHolder(GankCategoryHolder holder, int position) {
            holder.titleTV.setText(mList.get(position).getDesc());

            if (mList.get(position).getImages() != null) {
                holder.iconIV.setVisibility(View.VISIBLE);
                Glide.with(MyApplication.getContext()).load(mList.get(position).getImages().get(0) + "?imageView2/0/w/" + iconWidth)
                        .error(R.mipmap.ic_launcher)
                        .crossFade(200)
                        .into(holder.iconIV);
            } else {
                holder.iconIV.setVisibility(View.GONE);
            }
        }

        @Override
        public int getItemCount() {
            return mList.size() > 0 ? mList.size() : 0;
        }

        public class GankCategoryHolder extends RecyclerView.ViewHolder {
            private TextView titleTV;
            private ImageView iconIV;
            public GankCategoryHolder(View itemView) {
                super(itemView);
                titleTV = (TextView) itemView.findViewById(R.id.gank_category_rv_item_title_tv);
                iconIV = (ImageView) itemView.findViewById(R.id.gank_category_rv_item_icon_iv);
            }
        }
    }

}
