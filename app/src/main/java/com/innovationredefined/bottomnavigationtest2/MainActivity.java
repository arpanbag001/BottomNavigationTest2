package com.innovationredefined.bottomnavigationtest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationViewEx bnve = findViewById(R.id.bnve);
        bnve.setTextVisibility(false);
        bnve.enableShiftingMode(false);
        bnve.setItemHeight(BottomNavigationViewEx.dp2px(this, 48));
    }
}
