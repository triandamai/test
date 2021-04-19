package com.trian.test_app.utils;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class MyActivity<Binding extends ViewDataBinding> extends AppCompatActivity {
    private Binding _;

    protected void setBinding(Activity activity,int layoutId){
        this._ = DataBindingUtil.setContentView(activity,layoutId);
    }
}
