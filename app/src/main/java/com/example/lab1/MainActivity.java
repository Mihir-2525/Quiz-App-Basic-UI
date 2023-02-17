package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.upgrade);
        b1.setOnClickListener(view -> {
            Intent in =new Intent(MainActivity.this,mcq.class);
            startActivity(in);
        });
    }
}