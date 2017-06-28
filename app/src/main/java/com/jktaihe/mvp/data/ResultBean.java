package com.jktaihe.mvp.data;

/**
 * Created by jktaihe on 22/4/17.
 * blog: blog.jktaihe.com
 */

public class ResultBean<T>{
    public int resultCode;
    public String resultMsg;
    public T data;

    public ResultBean(int resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }
}
