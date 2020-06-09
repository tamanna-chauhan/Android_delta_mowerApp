package com.example.mowerapp.ui.menu.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.example.mowerapp.R;
import com.example.mowerapp.ui.menu.MenuActivity;

public class PasswordDialog extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public ImageView yes, no;

    public PasswordDialog(Activity a) {
        super(a);
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);


        setContentView(R.layout.activity_password);
        yes =  findViewById(R.id.img_string);
        yes.setOnClickListener(this);
        /*no.setOnClickListener(this);*/

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_string:

                Intent i = new Intent(getContext(), MenuActivity.class);
                getContext().startActivity(i);
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
