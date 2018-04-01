package com.iblogstreet.plugindemo;

import android.util.Log;

import com.iblogstreet.annotation.Route;
import com.iblogstreet.base.TestService;

/**
 * Created by armyone on 2018/4/1.
 */
@Route(path = "/main/service1")
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        Log.e("TestService","我是Main中的service 1");
    }
}
