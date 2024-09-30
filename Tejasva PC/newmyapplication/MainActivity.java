package com.example.newmyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button btnstart,btnend;
   Activity mcontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnend = findViewById(R.id.button2end);
        btnstart = findViewById(R.id.buttonstart);

        btnstart.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mcontext.startService(new Intent(mcontext.getApplicationContext(),MyService.class));
                    }
                }
        );

        btnend.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mcontext.stopService(new Intent(mcontext.getApplicationContext(),MyService.class));
                    }
                }
        );
    }
}