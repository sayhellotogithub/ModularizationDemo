package com.iblogstreet.moduletwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.iblogstreet.annotation.Route;
import com.iblogstreet.core.IBRouter;

@Route(path = "/moduletwo/testtwo")
public class TestTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_two);
    }


    public void jumpMain(View view) {
        IBRouter.getInstance().build("/main/main").navigation();

    }

    public void jumpModuleOne(View view) {
        IBRouter.getInstance().build("/moduleone/test").navigation();

    }
}
