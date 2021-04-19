package com.trian.test_app.ui.main;

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
import com.trian.test_app.databinding.FragmentMainBinding;
import com.trian.test_app.utils.MyFragment;

public class FragmentMain extends MyFragment<FragmentMainViewModel, FragmentMainBinding> {



    public static FragmentMain newInstance() {
        return new FragmentMain();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        setBinding(inflater,R.layout.fragment_main,container);
        setVM((ViewModelStoreOwner)getViewLifecycleOwner(),FragmentMainViewModel.class);
        return _.getRoot();
    }


}