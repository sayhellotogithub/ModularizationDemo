package com.iblogstreet.moduleone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.iblogstreet.annotation.Route;
import com.iblogstreet.core.IBRouter;


@Route(path = "/moduleone/test")
public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        if (BuildConfig.isModule) {

        }
    }

    public void jumpMain(View view) {
        IBRouter.getInstance().build("/main/main").navigation();

    }
    public void jumpModuleTwo(View view) {
        IBRouter.getInstance().build("/moduletwo/testtwo").navigation();

    }
}
