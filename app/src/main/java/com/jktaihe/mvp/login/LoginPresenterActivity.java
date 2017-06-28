package com.jktaihe.mvp.login;


import android.text.TextUtils;
import com.jktaihe.mvp.data.ResultBean;
import com.jktaihe.mvp.login.bean.User;
import com.jktaihe.mvplibrary.BaseActivityPresenter;
/**
 * Created by jktaihe on 22/4/17.
 * blog: blog.jktaihe.com
 */

public class LoginPresenterActivity extends BaseActivityPresenter<LoginView,LoginModel> implements LoginConstract.IPresenter {

    @Override
    public void login(String username,String password){

        if (TextUtils.isEmpty(username)){
            viewDelegate.loginResult(new ResultBean(-1,"username is not empty"));
            return;
        }

        model.requestLogin(username,password);
    }

    @Override
    public void loginResult(User user){

        ResultBean resultBean = new ResultBean<User>(1,"login success");
        resultBean.data = user;

        viewDelegate.loginResult(new ResultBean(1,resultBean.resultMsg));
    }


    @Override
    public void create() {

    }
}
