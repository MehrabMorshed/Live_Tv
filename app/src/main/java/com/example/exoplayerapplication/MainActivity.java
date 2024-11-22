package com.example.exoplayerapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private AppCompatButton btn;
    private String Tvurl="https://albportal.net/albkanalemusic.m3u8";
    private String Tvname="Cartoon";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExoPlayerActivity.get_tv_url = Tvurl;
                ExoPlayerActivity.getTvName = Tvname;
                startActivity(new Intent(MainActivity.this,ExoPlayerActivity.class));
            }
        });
    }
}