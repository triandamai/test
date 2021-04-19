package com.trian.test_app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;

import com.trian.test_app.R;
import com.trian.test_app.databinding.ActivityMainBinding;
import com.trian.test_app.utils.MyActivity;

public class MainActivity extends MyActivity<ActivityMainBinding> {
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBinding(this,R.layout.activity_main);
        navController = Navigation.findNavController(this,R.id.nav_host_app);

    }
}