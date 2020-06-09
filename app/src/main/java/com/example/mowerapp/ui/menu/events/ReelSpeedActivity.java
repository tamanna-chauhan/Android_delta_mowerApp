package com.example.mowerapp.ui.menu.events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mowerapp.R;

public class ReelSpeedActivity extends AppCompatActivity {

    private ImageView btn_accept,btn_increase,btn_decrease,img_speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reel_speed);

        init();
        clickEvents();
    }

    private void init() {

        btn_accept = findViewById(R.id.img_accept);
        btn_increase = findViewById(R.id.increase);
        btn_decrease = findViewById(R.id.decrease);
        img_speed = findViewById(R.id.speed);
    }

    private void clickEvents() {

        btn_accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ReelSpeedActivity.this, ReelSpeedLowActivity.class);
                startActivity(i);
                finish();
            }
        });

        btn_decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(img_speed.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.twofifty).getConstantState()){
                    img_speed.setImageResource(R.drawable.twoforty);
                }else if(img_speed.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.twosixty).getConstantState()){
                    img_speed.setImageResource(R.drawable.twofifty);
                }else{

                }


            }
        });


        btn_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(img_speed.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.twofifty).getConstantState()){
                    img_speed.setImageResource(R.drawable.twosixty);
                }else if(img_speed.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.twoforty).getConstantState()){
                    img_speed.setImageResource(R.drawable.twofifty);
                }else{

                }


            }
        });
    }
}
