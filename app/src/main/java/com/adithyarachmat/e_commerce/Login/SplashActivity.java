package com.adithyarachmat.e_commerce.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.adithyarachmat.e_commerce.R;

public class SplashActivity extends AppCompatActivity {

    private int waktu_loading=2000;
    //4000=4 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan langsung berpindah ke home activity
                Intent login=new Intent(SplashActivity.this, MainActivity.class);
                startActivity(login);
                finish();
            }
        },waktu_loading);
    }
}