package com.jktaihe.mvp.login;

import com.jktaihe.mvp.login.bean.User;
import com.jktaihe.mvplibrary.BaseModel;

/**
 * Created by jktaihe on 22/4/17.
 * blog: blog.jktaihe.com
 */

public class LoginModel extends BaseModel<LoginPresenterActivity> implements LoginConstract.IModel {

    @Override
    public void requestLogin(String username, String password){

        User user = new User();
        user.userName = username;
        user.age = 20;

        mPresenter.loginResult(user);
    }

}
