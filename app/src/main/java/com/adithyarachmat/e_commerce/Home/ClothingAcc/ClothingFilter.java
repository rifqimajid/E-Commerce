package com.adithyarachmat.e_commerce.Home.ClothingAcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.adithyarachmat.e_commerce.Home.ClothingAcc.Men.ClothingCategory;
import com.adithyarachmat.e_commerce.R;

public class ClothingFilter extends AppCompatActivity {

    private TextView men,women;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing_filter);
        men = findViewById(R.id.TVmen);
        women = findViewById(R.id.TVwomen);
    }

    public void MenOnClick(View view) {
        Intent iMenCloth = new Intent(getApplicationContext(), ClothingCategory.class);
        startActivity(iMenCloth);
    }

    public void WomenOnClick(View view) {
    }
}