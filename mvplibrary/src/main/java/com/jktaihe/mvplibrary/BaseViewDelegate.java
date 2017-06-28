package com.jktaihe.mvplibrary;

import android.view.View;
import com.jktaihe.mvplibrary.constract.IView;

/**
 * Created by jktaihe on 22/4/17.
 * blog: blog.jktaihe.com
 */

public abstract class BaseViewDelegate<P extends BaseActivityPresenter> implements IView {

    protected View contentView;
    protected P mPresenter;

    public void setPresenter(P presenter){
        mPresenter = presenter;
    }

    protected void onDestroy(){
        mPresenter = null;
    }


}
