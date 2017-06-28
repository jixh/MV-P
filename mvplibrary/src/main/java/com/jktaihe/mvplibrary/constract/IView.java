package com.jktaihe.mvplibrary.constract;

import android.support.annotation.LayoutRes;

/**
 * Created by jktaihe on 7/6/17.
 * blog: blog.jktaihe.com
 */

public interface IView {
    void initView();
    @LayoutRes int layoutId();
}
