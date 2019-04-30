package com.example.ironmanwallpapers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MK33Activity extends AppCompatActivity {
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mk33);
        setTitle("MARK XXXIII");
        findViewById(R.id.mk33_image_container).setOnClickListener(v -> {
            count++;
            if (count % 3 == 0) {
                findViewById(R.id.mk33_image_3).setVisibility(View.GONE);
                findViewById(R.id.mk33_image_1).setVisibility(View.VISIBLE);
            } else if (count % 3 == 1) {
                findViewById(R.id.mk33_image_1).setVisibility(View.GONE);
                findViewById(R.id.mk33_image_2).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.mk33_image_2).setVisibility(View.GONE);
                findViewById(R.id.mk33_image_3).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.mk33_back).setOnClickListener(v -> {
            Intent newIntent = new Intent(this, SetupActivity.class);
            startActivity(newIntent);
        });
    }
}
