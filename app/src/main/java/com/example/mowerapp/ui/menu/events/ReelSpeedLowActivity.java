package com.example.mowerapp.ui.menu.events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mowerapp.R;
import com.example.mowerapp.ui.HomeActivity;

public class ReelSpeedLowActivity extends AppCompatActivity {

    private ImageView btn_foc,btn_increase,btn_decrease,img_speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reel_speed_low);

        init();
        clickevents();
    }


    private void init() {

        btn_foc = findViewById(R.id.img_accept);
        btn_increase = findViewById(R.id.increase);
        btn_decrease = findViewById(R.id.decrease);
        img_speed = findViewById(R.id.speed);
    }

    private void clickevents() {

        btn_foc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ReelSpeedLowActivity.this, FixedModeActivity.class);
                startActivity(i);
                finish();
            }
        });

        btn_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(img_speed.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.nine).getConstantState()){
                    img_speed.setImageResource(R.drawable.ten);
                }else if(img_speed.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.ten).getConstantState()){
                    img_speed.setImageResource(R.drawable.eleven);
                }else{

                }
            }
        });

        btn_decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(img_speed.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.ten).getConstantState()){
                    img_speed.setImageResource(R.drawable.nine);
                }else if(img_speed.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.eleven).getConstantState()){
                    img_speed.setImageResource(R.drawable.ten);
                }else{

                }

            }
        });
    }


}
