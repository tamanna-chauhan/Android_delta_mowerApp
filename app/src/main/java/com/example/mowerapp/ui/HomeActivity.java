package com.example.mowerapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mowerapp.R;
import com.example.mowerapp.ui.menu.dialog.PasswordDialog;

public class HomeActivity extends AppCompatActivity {

    private ImageView btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        init();
        clickEvents();
    }


    private void init() {

        btnMenu = findViewById(R.id.img_menu);
    }

    private void clickEvents() {

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                PasswordDialog cdd=new PasswordDialog(HomeActivity.this);
                cdd.show();
            }
        });
    }

}
