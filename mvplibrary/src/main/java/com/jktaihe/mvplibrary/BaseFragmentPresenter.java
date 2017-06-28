package com.jktaihe.mvplibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jktaihe.mvplibrary.constract.IView;
import com.jktaihe.mvplibrary.utils.ClassUtils;

/**
 * Created by jktaihe on 7/6/17.
 * blog: blog.jktaihe.com
 */

public abstract class BaseFragmentPresenter<V extends BaseViewDelegate,M extends BaseModel> extends Fragment implements IView {

    protected V viewDelegate;

    protected M model;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        try {
            viewDelegate = (V) ClassUtils.getClass(getClass(),0).newInstance();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        viewDelegate.contentView = inflater.inflate(viewDelegate.layoutId(),container);

        return viewDelegate.contentView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        try {
            model = (M) ClassUtils.getClass(getClass(),1).newInstance();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        viewDelegate.initView();
    }
}
