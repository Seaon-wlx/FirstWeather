package com.firstweather.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.firstweather.android.ChooseAreaFragment.LEVEL_CITY;
import static com.firstweather.android.ChooseAreaFragment.LEVEL_COUNTY;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
