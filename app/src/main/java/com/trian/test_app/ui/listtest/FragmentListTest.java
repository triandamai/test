package com.trian.test_app.ui.listtest;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trian.test_app.R;
import com.trian.test_app.databinding.FragmentTestBinding;
import com.trian.test_app.ui.main.FragmentMainViewModel;
import com.trian.test_app.utils.MyFragment;

public class FragmentListTest extends MyFragment<FragmentListTestViewModel, FragmentTestBinding> {


    public static FragmentListTest newInstance() {
        return new FragmentListTest();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        setBinding(inflater,R.layout.fragment_listtest,container);
        setVM((ViewModelStoreOwner) getViewLifecycleOwner(), FragmentListTestViewModel.class);
        return _v.getRoot();
    }



}