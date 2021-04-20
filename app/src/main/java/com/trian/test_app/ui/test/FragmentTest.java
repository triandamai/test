package com.trian.test_app.ui.test;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelStoreOwner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trian.test_app.R;
import com.trian.test_app.databinding.FragmentTestBinding;
import com.trian.test_app.utils.MyFragment;

public class FragmentTest extends MyFragment<FragmentTestViewModel, FragmentTestBinding> {


    public static FragmentTest newInstance() {
        return new FragmentTest();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        setBinding(inflater,R.layout.fragment_test,container);
        setVM((ViewModelStoreOwner)getViewLifecycleOwner(), FragmentTestViewModel.class);
        return _v.getRoot();
    }



}