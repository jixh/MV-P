package com.jktaihe.mvp.login;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jktaihe.mvp.R;
import com.jktaihe.mvp.data.ResultBean;
import com.jktaihe.mvplibrary.BaseViewDelegate;

/**
 * Created by jktaihe on 22/4/17.
 * blog: blog.jktaihe.com
 */

public class LoginView extends BaseViewDelegate<LoginPresenterActivity> implements LoginConstract.IView{

    EditText etUserName;
    EditText etPassword;
    Button btnOK;

    @Override
    public int layoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initView(){
        etUserName = (EditText) contentView.findViewById(R.id.et_username);
        etPassword = (EditText) contentView.findViewById(R.id.et_password);
        btnOK = (Button) contentView.findViewById(R.id.btn_ok);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login(etUserName.getText().toString(),etPassword.getText().toString());
            }
        });
    }

    @Override
    public void loginResult(ResultBean resultBean){
        Toast.makeText(mPresenter, resultBean.resultCode == 0 ? "login success":resultBean.resultMsg, Toast.LENGTH_SHORT).show();
    }

}
