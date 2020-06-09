package com.example.mowerapp.ui.menu.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.mowerapp.R;
import com.example.mowerapp.ui.menu.MenuActivity;
import com.example.mowerapp.ui.menu.events.MowerSetupActivity;
import com.example.mowerapp.ui.menu.events.ReelSpeedActivity;
import com.example.mowerapp.ui.menu.events.ReelSpeedLowActivity;

public class ReelSpeedDialog extends Dialog implements
        android.view.View.OnClickListener {


    public Dialog d;
    public ImageView yes, no;
    private MowerSetupActivity activity;
    private ImageView btn_accept,btn_increase,btn_decrease,img_speed;

    public ReelSpeedDialog(MowerSetupActivity a) {
        super(a);

        this.activity = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);


        setContentView(R.layout.activity_reel_speed);

        yes =  findViewById(R.id.img_accept);
        yes.setOnClickListener(this);
        /*no.setOnClickListener(this);*/

        init();
        clickEvents();


    }

    private void init() {

        btn_increase = findViewById(R.id.increase);
        btn_decrease = findViewById(R.id.decrease);
        img_speed = findViewById(R.id.speed);
    }

    private void clickEvents() {


        btn_decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(img_speed.getDrawable().getConstantState() == activity.getResources().getDrawable( R.drawable.twofifty).getConstantState()){
                    img_speed.setImageResource(R.drawable.twoforty);
                }else if(img_speed.getDrawable().getConstantState() == activity.getResources().getDrawable( R.drawable.twosixty).getConstantState()){
                    img_speed.setImageResource(R.drawable.twofifty);
                }else{

                }


            }
        });


        btn_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(img_speed.getDrawable().getConstantState() == activity.getResources().getDrawable(R.drawable.twofifty).getConstantState()){
                    img_speed.setImageResource(R.drawable.twosixty);
                }else if(img_speed.getDrawable().getConstantState() == activity.getResources().getDrawable(R.drawable.twoforty).getConstantState()){
                    img_speed.setImageResource(R.drawable.twofifty);
                }else{

                }


            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_accept:

                ReelSpeedLowDialog reelSpeedLowDialog = new ReelSpeedLowDialog(activity);
                reelSpeedLowDialog.show();
            /*case R.id.btn_no:
                dismiss();
                break;*/
            default:
                break;
        }
        dismiss();
    }


}

