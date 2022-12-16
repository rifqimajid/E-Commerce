package com.adithyarachmat.e_commerce.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.adithyarachmat.e_commerce.R;

public class AdminLogin extends AppCompatActivity {

    private Button BtnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        BtnLogin = findViewById(R.id.BTNlogin);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLogin = new Intent(getApplicationContext(),AdminPage.class);
                startActivity(iLogin);
            }
        });
    }
}