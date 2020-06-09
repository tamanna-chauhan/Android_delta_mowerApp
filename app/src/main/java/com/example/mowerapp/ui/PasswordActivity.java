package com.example.mowerapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mowerapp.R;
import com.example.mowerapp.ui.menu.MenuActivity;

public class PasswordActivity extends AppCompatActivity {

    private ImageView btn_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        this.setFinishOnTouchOutside(true);

        init();
        clickEvents();
    }

    private void init() {

        btn_pwd = findViewById(R.id.img_string);
    }

    private void clickEvents() {

        btn_pwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(PasswordActivity.this, MenuActivity.class);
                startActivity(i);

                finish();
            }
        });
    }

}
