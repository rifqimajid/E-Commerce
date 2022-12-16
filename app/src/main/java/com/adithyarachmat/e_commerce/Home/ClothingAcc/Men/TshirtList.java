package com.adithyarachmat.e_commerce.Home.ClothingAcc.Men;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.adithyarachmat.e_commerce.R;

public class TshirtList extends AppCompatActivity {
    private ImageView tshirt1,tshirt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirt_list);
        tshirt1 = findViewById(R.id.tshirt1);
        tshirt2 = findViewById(R.id.tshirt2);
    }

    public void img2OnClick(View view) {
        Intent iTshirts2 = new Intent(getApplicationContext(), Tshirt2DetailActivity.class);
        startActivity(iTshirts2);
    }

    public void img1OnClick(View view) {
        Intent iTshirts1 = new Intent(getApplicationContext(), Tshirt1DetailsActivity.class);
        startActivity(iTshirts1);
    }
}