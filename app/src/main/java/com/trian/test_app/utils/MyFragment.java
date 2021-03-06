package com.trian.test_app.utils;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

public abstract class MyFragment<VM extends AndroidViewModel,Binding extends ViewDataBinding> extends Fragment {
    protected VM _vm;
    protected Binding _v;

    protected void setBinding(LayoutInflater inflater, int layoutId, ViewGroup viewGroup){
        this._v = DataBindingUtil.inflate(inflater,layoutId,viewGroup,false);
    }

    protected void setVM(ViewModelStoreOwner owner,Class<VM> vmClass){
        this._vm = new ViewModelProvider(owner).get(vmClass);
    }
}
