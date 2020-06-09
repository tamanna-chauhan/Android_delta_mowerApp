package com.example.mowerapp.ui.menu.events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mowerapp.R;
import com.example.mowerapp.ui.HomeActivity;
import com.example.mowerapp.ui.menu.MenuActivity;

public class FixedModeActivity extends AppCompatActivity {

    private ImageView btn_foc,btn_home,img_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixed_mode);


        init();
        clickevents();
    }


    private void init() {

        btn_foc = findViewById(R.id.img_foc);
        btn_home = findViewById(R.id.img_home);
        img_menu = findViewById(R.id.img_menu);
    }

    private void clickevents() {


        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(FixedModeActivity.this, HomeActivity.class);
                startActivity(i);
                finish();
            }
        });

        img_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(FixedModeActivity.this, MenuActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}

