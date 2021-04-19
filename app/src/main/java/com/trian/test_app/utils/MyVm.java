package com.trian.test_app.utils;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.trian.test_app.data.DevDatabase;

public abstract class MyVm extends AndroidViewModel {
    protected DevDatabase _db;

    public MyVm(@NonNull Application application) {
        super(application);
        _db = DevDatabase.getInstance(application.getApplicationContext());

    }
}
