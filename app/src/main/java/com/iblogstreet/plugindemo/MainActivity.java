package com.iblogstreet.plugindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.iblogstreet.annotation.Route;
import com.iblogstreet.core.IBRouter;

@Route(path = "/main/main")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpInner(View view) {
        //  IBRouter.getInstance().build("/main/second").navigation();
        IBRouter.getInstance().build("/main/second").navigation(this, 100);
    }

    public void jumpModuleOne(View view) {
        IBRouter.getInstance().build("/moduleone/test").navigation();

    }

    public void jumpModuleTwo(View view) {
        IBRouter.getInstance().build("/moduletwo/testtwo").navigation();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(this, "requestCode：" + requestCode + "resultCode:" + resultCode, Toast.LENGTH_LONG).show();
    }
}
