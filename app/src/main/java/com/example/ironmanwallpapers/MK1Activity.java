package com.example.ironmanwallpapers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Set;

public class MK1Activity extends AppCompatActivity {
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mk1);
        setTitle("MARK I");
        findViewById(R.id.mk1_image_container).setOnClickListener(v -> {
            count++;
            if (count % 4 == 0) {
                findViewById(R.id.mk1_image_4).setVisibility(View.GONE);
                findViewById(R.id.mk1_image_1).setVisibility(View.VISIBLE);
            } else if (count % 4 == 1) {
                findViewById(R.id.mk1_image_1).setVisibility(View.GONE);
                findViewById(R.id.mk1_image_2).setVisibility(View.VISIBLE);
            } else if (count % 4 == 2) {
                findViewById(R.id.mk1_image_2).setVisibility(View.GONE);
                findViewById(R.id.mk1_image_3).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.mk1_image_3).setVisibility(View.GONE);
                findViewById(R.id.mk1_image_4).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.mk1_back).setOnClickListener(v -> {
            Intent newIntent = new Intent(this, SetupActivity.class);
            startActivity(newIntent);
        });
    }
}
