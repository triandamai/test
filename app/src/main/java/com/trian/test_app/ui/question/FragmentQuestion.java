package com.trian.test_app.ui.question;

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
import com.trian.test_app.databinding.FragmentQuestionBinding;
import com.trian.test_app.utils.MyFragment;
import com.trian.test_app.utils.MyVm;

public class FragmentQuestion extends MyFragment<FragmentQuestionViewModel, FragmentQuestionBinding> {

    private FragmentQuestionViewModel mViewModel;

    public static FragmentQuestion newInstance() {
        return new FragmentQuestion();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        setBinding(inflater,R.layout.fragment_question,container);
        setVM((ViewModelStoreOwner) getViewLifecycleOwner(),FragmentQuestionViewModel.class);
        return _v.getRoot();
    }


}