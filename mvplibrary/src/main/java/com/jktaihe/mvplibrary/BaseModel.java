package com.jktaihe.mvplibrary;

/**
 * Created by jktaihe on 22/4/17.
 * blog: blog.jktaihe.com
 */

public abstract class BaseModel<P extends BaseActivityPresenter> {

    protected P mPresenter;

    public void setPresenter(P presenter){
        mPresenter = presenter;
    }

    protected void onDestroy(){
        mPresenter = null;
    }

}
