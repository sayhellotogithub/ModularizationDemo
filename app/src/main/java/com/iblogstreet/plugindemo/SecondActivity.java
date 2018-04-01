package com.iblogstreet.plugindemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.iblogstreet.annotation.Extra;
import com.iblogstreet.annotation.Route;
import com.iblogstreet.base.TestService;
import com.iblogstreet.core.IBRouter;

/**
 * Created by armyone on 2018/4/1.
 */
@Route(path = "/main/second")
public class SecondActivity extends AppCompatActivity {
    @Extra(name = "/main/service1")
    TestService testService1;
    @Extra(name = "/main/service2")
    TestService testService2;
    @Extra(name = "/moduleone/service")
    TestService testService3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        IBRouter.getInstance().inject(this);
        testService1.test();
        testService2.test();
        testService3.test();
    }

    @Override
    public void onBackPressed() {
        setResult(200);
        super.onBackPressed();
    }
}
