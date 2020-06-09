package com.example.mowerapp.ui.menu.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.mowerapp.R;
import com.example.mowerapp.ui.menu.MenuActivity;
import com.example.mowerapp.ui.menu.events.FixedModeActivity;
import com.example.mowerapp.ui.menu.events.MowerSetupActivity;
import com.example.mowerapp.ui.menu.events.ReelSpeedLowActivity;

public class ReelSpeedLowDialog extends Dialog implements
        android.view.View.OnClickListener {

    /*public Activity c;*/
    public Dialog d;
    public ImageView yes, no;

    private MowerSetupActivity activity;

    private ImageView btn_foc,btn_increase,btn_decrease,img_speed;

    public ReelSpeedLowDialog(MowerSetupActivity a) {
        super(a);

        this.activity = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);


        setContentView(R.layout.activity_reel_speed_low);
        yes =  findViewById(R.id.img_accept);
        yes.setOnClickListener(this);
        /*no.setOnClickListener(this);*/

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



        btn_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(img_speed.getDrawable().getConstantState() == activity.getResources().getDrawable(R.drawable.nine).getConstantState()){
                    img_speed.setImageResource(R.drawable.ten);
                }else if(img_speed.getDrawable().getConstantState() == activity.getResources().getDrawable(R.drawable.ten).getConstantState()){
                    img_speed.setImageResource(R.drawable.eleven);
                }else{

                }
            }
        });

        btn_decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(img_speed.getDrawable().getConstantState() == activity.getResources().getDrawable( R.drawable.ten).getConstantState()){
                    img_speed.setImageResource(R.drawable.nine);
                }else if(img_speed.getDrawable().getConstantState() == activity.getResources().getDrawable( R.drawable.eleven).getConstantState()){
                    img_speed.setImageResource(R.drawable.ten);
                }else{

                }

            }
        });
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_accept:

                Intent i = new Intent(getContext(), FixedModeActivity.class);
                getContext().startActivity(i);
                activity.finish();
                break;
            /*case R.id.btn_no:
                dismiss();
                break;*/
            default:
                break;
        }
        dismiss();
    }
}
