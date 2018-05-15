package com.innovationredefined.bottomnavigationtest2;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity {

    BottomNavigationViewEx bnve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnve = findViewById(R.id.bnve);
        setUpBnvAccordingToOrientation(bnve,this.getResources().getConfiguration().orientation);

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Checks the orientation of the screen
        setUpBnvAccordingToOrientation(bnve, newConfig.orientation);

    }

    void setUpBnvAccordingToOrientation(BottomNavigationViewEx bnve, int orientation) {
        bnve.enableShiftingMode(false);

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            //code for portrait mode
            bnve.setTextVisibility(false);
            bnve.setItemHeight(BottomNavigationViewEx.dp2px(this, 48));
        } else if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //code for landscape mode
            bnve.setTextVisibility(true);
            //bnve.setItemHeight(BottomNavigationViewEx.dp2px(this, 48));
        }

    }
}
