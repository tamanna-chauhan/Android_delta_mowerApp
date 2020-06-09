package com.example.mowerapp.ui.menu.events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mowerapp.R;

public class ReelModeActivity extends AppCompatActivity {

    private ImageView btn_accept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reel_mode);

        init();
        clickEvents();
    }


    private void init() {

        btn_accept = findViewById(R.id.img_accept);
    }

    private void clickEvents() {

        btn_accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ReelModeActivity.this, ReelSpeedActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
