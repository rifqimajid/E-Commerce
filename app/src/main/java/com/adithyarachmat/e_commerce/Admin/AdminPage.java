package com.adithyarachmat.e_commerce.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.adithyarachmat.e_commerce.R;

public class AdminPage extends AppCompatActivity {

    private Button btnAddStaff,btnAddStock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);

        btnAddStaff = findViewById(R.id.BTNaddstaff);
        btnAddStock = findViewById(R.id.BTNaddstock);

        btnAddStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iAddStock = new Intent(getApplicationContext(),AddStock.class);
                startActivity(iAddStock);
            }
        });

        btnAddStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iAddStaff = new Intent(getApplicationContext(),RegisterStaff.class);
                startActivity(iAddStaff);
            }
        });
    }
}