package com.jktaihe.mvp.login;

import com.jktaihe.mvp.data.ResultBean;
import com.jktaihe.mvp.login.bean.User;

/**
 * Created by jktaihe on 28/6/17.
 * blog: blog.jktaihe.com
 */

public interface LoginConstract {

    interface IPresenter {
        void login(String username,String password);
        void loginResult(User user);
    }

    interface IModel{
        void requestLogin(String username, String password);
    }

    interface IView{
        void loginResult(ResultBean resultBean);
    }

}
