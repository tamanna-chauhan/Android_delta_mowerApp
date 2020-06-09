package com.example.mowerapp.ui.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mowerapp.R;
import com.example.mowerapp.ui.HomeActivity;
import com.example.mowerapp.ui.menu.events.MowerSetupActivity;

public class MenuActivity extends AppCompatActivity {

    private ImageView btn_moversetup,btn_home,img_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        init();
        clickEvents();
    }

    private void init(){

        btn_moversetup = findViewById(R.id.img_mowersetup);
        btn_home = findViewById(R.id.img_home);
        img_menu = findViewById(R.id.img_menu);

    }

    private void clickEvents() {

        btn_moversetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =  new Intent(MenuActivity.this, MowerSetupActivity.class);
                startActivity(i);
                finish();
            }
        });

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this, HomeActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
