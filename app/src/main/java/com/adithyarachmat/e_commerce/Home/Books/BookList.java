package com.adithyarachmat.e_commerce.Home.Books;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.adithyarachmat.e_commerce.Home.ClothingAcc.Men.Tshirt1DetailsActivity;
import com.adithyarachmat.e_commerce.R;

public class BookList extends AppCompatActivity {
    private ImageView buku1,buku2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        buku1 = findViewById(R.id.buku1);
        buku2 = findViewById(R.id.buku2);
    }

    public void buku1OnClick(View view) {
        Intent iBuku1 = new Intent(getApplicationContext(), Book1Detail.class);
        startActivity(iBuku1);
    }

    public void buku2OnClick(View view) {
    }
}