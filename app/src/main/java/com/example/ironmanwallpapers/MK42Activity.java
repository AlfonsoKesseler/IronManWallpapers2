package com.example.ironmanwallpapers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MK42Activity extends AppCompatActivity {
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mk42);
        setTitle("MARK XLII");
        findViewById(R.id.mk42_image_container).setOnClickListener(v -> {
            count++;
            if (count % 4 == 0) {
                findViewById(R.id.mk42_image_4).setVisibility(View.GONE);
                findViewById(R.id.mk42_image_1).setVisibility(View.VISIBLE);
            } else if (count % 4 == 1) {
                findViewById(R.id.mk42_image_1).setVisibility(View.GONE);
                findViewById(R.id.mk42_image_2).setVisibility(View.VISIBLE);
            } else if (count % 4 == 2) {
                findViewById(R.id.mk42_image_2).setVisibility(View.GONE);
                findViewById(R.id.mk42_image_3).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.mk42_image_3).setVisibility(View.GONE);
                findViewById(R.id.mk42_image_4).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.mk42_back).setOnClickListener(v -> {
            Intent newIntent = new Intent(this, SetupActivity.class);
            startActivity(newIntent);
        });
    }
}
