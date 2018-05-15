package com.innovationredefined.bottomnavigationtest2;

import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    BottomNavigationViewEx bnve;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SampleFragmentAdapter fragmentAdapter = new SampleFragmentAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.vp);
        viewPager.setAdapter(fragmentAdapter);
        bnve = findViewById(R.id.bnve);
        setUpBnvAccordingToOrientation(bnve, this.getResources().getConfiguration().orientation);
        bnve.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                bnve.refreshLabelsVisibility();
                switch (item.getItemId()) {
                    case R.id.menu_item_one:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.menu_item_two:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.menu_item_three:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.menu_item_four:
                        viewPager.setCurrentItem(3);
                        break;
                }
                return false;
            }
        });


    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Checks the orientation of the screen
        setUpBnvAccordingToOrientation(bnve, newConfig.orientation);
    }

    void setUpBnvAccordingToOrientation(BottomNavigationViewEx bnve, int orientation) {

        bnve.enableAnimation(false);
        bnve.enableShiftingMode(false);
        bnve.enableItemShiftingMode(false);

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            //code for portrait mode
            bnve.setTextVisibility(false);
            bnve.setItemHeight(BottomNavigationViewEx.dp2px(this, 48));
            bnve.setIconsMarginTop(BottomNavigationViewEx.dp2px(this, 12));
        } else if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //code for landscape mode
            bnve.setTextVisibility(true);
            bnve.setButtonsLabelsVisibility(true);
            //bnve.setItemHeight(BottomNavigationViewEx.dp2px(this, 48));
        }

    }
}
