package com.yuxie.myapp.mvvp;


import android.app.Activity;
import android.os.Bundle;

import com.yuxie.myapp.R;
//import com.yuxie.myapp.databinding.ActivityMvvpBinding;

public class MvvpActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mvvp);mvvp中有下面的方法取代它

        //每个activity都有一个对应的activity类名(ActivityMvvp)+Binding(如:ActivityMvvpBinding)
//        ActivityMvvpBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvp);
////        binding.setUser(new User(666, "一口仨馍", "走在勇往直前的路上"));
    }
}
