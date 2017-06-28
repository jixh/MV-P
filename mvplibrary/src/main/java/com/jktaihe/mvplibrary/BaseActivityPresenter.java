package com.jktaihe.mvplibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.jktaihe.mvplibrary.constract.IPresenter;
import com.jktaihe.mvplibrary.utils.ClassUtils;


/**
 * Created by jktaihe on 22/4/17.
 * blog: blog.jktaihe.com
 */

public abstract class BaseActivityPresenter<V extends BaseViewDelegate,M extends BaseModel> extends AppCompatActivity implements IPresenter{

    protected V viewDelegate;

    protected M model;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            viewDelegate = (V) ClassUtils.getClass(getClass(),0).newInstance();
            viewDelegate.setPresenter(this);
            model = (M) ClassUtils.getClass(getClass(),1).newInstance();
            model.setPresenter(this);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        setContentView(viewDelegate.layoutId());

        viewDelegate.contentView = getWindow().getDecorView().getRootView();

        viewDelegate.initView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (viewDelegate!=null)viewDelegate.onDestroy();
        if (model!=null)model.onDestroy();
    }



}
