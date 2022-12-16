package com.adithyarachmat.e_commerce.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.adithyarachmat.e_commerce.About.AboutPage;
import com.adithyarachmat.e_commerce.Admin.AdminLogin;
import com.adithyarachmat.e_commerce.Admin.AdminPage;
import com.adithyarachmat.e_commerce.Admin.StaffLogin;
import com.adithyarachmat.e_commerce.R;

public class MainActivity extends AppCompatActivity {

    private Button btnToRegister,btnToLogin;
    private TextView TVtoadminlogin,TVtostafflogin,TVtoabout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToRegister = findViewById(R.id.BTNtoregister);
        btnToLogin = findViewById(R.id.BTNtologin);

        btnToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iToRegister = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(iToRegister);
            }
        });

        btnToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iToLogin = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(iToLogin);
            }
        });
    }

    public void AdminLoginOnClick(View view) {
        TVtoadminlogin = findViewById(R.id.TVadminlogin);

        TVtoadminlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iToAdminLogin = new Intent(getApplicationContext(), AdminLogin.class);
                startActivity(iToAdminLogin);
            }
        });
    }

    public void StaffLoginOnClick(View view) {
        TVtostafflogin = findViewById(R.id.TVstafflogin);

        TVtostafflogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iToStaffLogin = new Intent(getApplicationContext(), StaffLogin.class);
                startActivity(iToStaffLogin);
            }
        });
    }

    public void AboutOnClick(View view) {
        TVtoabout = findViewById(R.id.TVabout);

        TVtoabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iToAbout = new Intent(getApplicationContext(), AboutPage.class);
                startActivity(iToAbout);
            }
        });

    }
}