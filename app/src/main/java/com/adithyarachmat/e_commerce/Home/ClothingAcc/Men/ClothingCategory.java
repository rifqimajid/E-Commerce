package com.adithyarachmat.e_commerce.Home.ClothingAcc.Men;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.adithyarachmat.e_commerce.R;

public class ClothingCategory extends AppCompatActivity {
    private TextView TVtshirts,TVformalmen,TVjeansmen,TVshoesmen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing_category);
        TVtshirts = findViewById(R.id.TVtshirts);
        TVformalmen = findViewById(R.id.TVformalmen);
        TVjeansmen = findViewById(R.id.TVjeansmen);
        TVshoesmen = findViewById(R.id.TVshoesmen);
    }

    public void tshirtOnClick(View view) {
        Intent iTshirts = new Intent(getApplicationContext(), TshirtList.class);
        startActivity(iTshirts);

    }

    public void formalmenOnClick(View view) {
    }

    public void jeansmenOnClick(View view) {
    }

    public void shoesmenOnClick(View view) {
    }
}