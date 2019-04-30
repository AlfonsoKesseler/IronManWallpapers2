package com.example.ironmanwallpapers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SetupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        setTitle("I am Iron Man");
        findViewById(R.id.mk1_lead).setOnClickListener(v -> {
            Intent intent = new Intent(this, MK1Activity.class);
            startActivity(intent);
        });
        findViewById(R.id.mk2_lead).setOnClickListener(v -> {
            Intent intent = new Intent(this, MK2Activity.class);
            startActivity(intent);
        });
        findViewById(R.id.mk3_lead).setOnClickListener(v -> {
            Intent intent = new Intent(this, MK3Activity.class);
            startActivity(intent);
        });
        findViewById(R.id.mk5_lead).setOnClickListener(v -> {
            Intent intent = new Intent(this, MK5Activity.class);
            startActivity(intent);
        });
        findViewById(R.id.mk6_lead).setOnClickListener(v -> {
            Intent intent = new Intent(this, MK6Activity.class);
            startActivity(intent);
        });
        findViewById(R.id.mk17_lead).setOnClickListener(v -> {
            Intent intent = new Intent(this, MK17Activity.class);
            startActivity(intent);
        });
        findViewById(R.id.mk33_lead).setOnClickListener(v -> {
            Intent intent = new Intent(this, MK33Activity.class);
            startActivity(intent);
        });
        findViewById(R.id.mk42_lead).setOnClickListener(v -> {
            Intent intent = new Intent(this, MK42Activity.class);
            startActivity(intent);
        });

    }
}
