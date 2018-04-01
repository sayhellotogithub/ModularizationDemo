package com.iblogstreet.moduleone;

import android.util.Log;

import com.iblogstreet.annotation.Route;
import com.iblogstreet.base.TestService;

/**
 * Created by armyone on 2018/4/1.
 */
@Route(path = "/moduleone/service")
public class TestServiceImpl implements TestService {
    public static final String TAG = "TestServiceImpl";

    @Override
    public void test() {
        Log.e(TAG, "我是moduleone中的service");
    }
}
