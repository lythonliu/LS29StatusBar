package com.example.administrator.ls29statusbar;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends  BaseActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("动脑学院");
        setSupportActionBar(toolbar);
        View nav = findViewById(R.id.nav);
        setToolBarStyle(toolbar,nav,Color.GREEN);
        //5.0以上的用法  简单
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            getWindow().setStatusBarColor(Color.GREEN);
//            getWindow().setNavigationBarColor(Color.GREEN);
//        }
        //5.0以下   4.4 以上
        //4.4  放弃吧  某些厂商更改了API



    }
}
