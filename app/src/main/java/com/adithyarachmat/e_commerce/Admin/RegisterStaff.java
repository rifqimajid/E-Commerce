package com.adithyarachmat.e_commerce.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.adithyarachmat.e_commerce.R;

public class RegisterStaff extends AppCompatActivity {

    private Button btnRegStaff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_staff);

        btnRegStaff = findViewById(R.id.BTNregisstaff);

        btnRegStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iRegStaff = new Intent(getApplicationContext(),AdminPage.class);
                startActivity(iRegStaff);
            }
        });
    }
}