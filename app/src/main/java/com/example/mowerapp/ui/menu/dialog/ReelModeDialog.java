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
import com.example.mowerapp.ui.menu.events.MowerSetupActivity;

public class ReelModeDialog extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public ImageView yes, no;
    private MowerSetupActivity activity;

    public ReelModeDialog(MowerSetupActivity a) {
        super(a);
        this.activity = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        final Dialog d = new Dialog(activity);
        setContentView(R.layout.activity_reel_mode);
        yes =  findViewById(R.id.img_accept);
        yes.setOnClickListener(this);
        /*no.setOnClickListener(this);*/




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_accept:

                ReelSpeedDialog reelSpeedDialog = new ReelSpeedDialog(activity);
                reelSpeedDialog.show();
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
