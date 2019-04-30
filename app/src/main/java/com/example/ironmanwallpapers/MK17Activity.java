package com.example.ironmanwallpapers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MK17Activity extends AppCompatActivity {
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mk17);
        setTitle("MARK XVII");
        findViewById(R.id.mk17_image_container).setOnClickListener(v -> {
            count++;
            if (count % 2 == 0) {
                findViewById(R.id.mk17_image_2).setVisibility(View.GONE);
                findViewById(R.id.mk17_image_1).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.mk17_image_1).setVisibility(View.GONE);
                findViewById(R.id.mk17_image_2).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.mk17_back).setOnClickListener(v -> {
            Intent newIntent = new Intent(this, SetupActivity.class);
            startActivity(newIntent);
        });
    }
}
