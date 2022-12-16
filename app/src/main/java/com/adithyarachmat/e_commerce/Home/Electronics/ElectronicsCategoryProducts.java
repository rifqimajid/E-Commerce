package com.adithyarachmat.e_commerce.Home.Electronics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.adithyarachmat.e_commerce.Home.Electronics.Computers.ComputerList;
import com.adithyarachmat.e_commerce.Home.Electronics.Smartphones.SmartphoneList;
import com.adithyarachmat.e_commerce.R;

public class ElectronicsCategoryProducts extends AppCompatActivity {

    private TextView TVcomputer,TVsmartphones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics_category_products);
        TVcomputer = findViewById(R.id.TVcomputer);
        TVsmartphones = findViewById(R.id.TVsmartphones);
    }

    public void ComputerOnClick(View view) {
        Intent iComputer = new Intent(getApplicationContext(), ComputerList.class);
        startActivity(iComputer);
    }

    public void HPOnClick(View view) {
        Intent iSmartphones = new Intent(getApplicationContext(), SmartphoneList.class);
        startActivity(iSmartphones);
    }
}