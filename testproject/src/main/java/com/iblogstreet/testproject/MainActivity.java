package com.iblogstreet.testproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.iblogstreet.annotation.Route;

@Route(path ="/test/main")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Route(path = "/a/b")
    public class AActivity extends Activity{

    }
    @Route(path = "/a/c")
    public class CActivity extends Activity{

    }
    @Route(path = "/b/c")
    public class BActivity extends Activity{

    }
}
