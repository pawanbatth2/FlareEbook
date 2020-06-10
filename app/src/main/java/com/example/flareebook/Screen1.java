package com.example.flareebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
    }
    public void onclick(View view){
        Intent i = new Intent(Screen1.this, Screen3.class);
        startActivity(i);
    }
}
