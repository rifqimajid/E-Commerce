package com.adithyarachmat.e_commerce.Home.OtherItems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adithyarachmat.e_commerce.Home.ClothingAcc.Men.Tshirt1DetailsActivity;
import com.adithyarachmat.e_commerce.R;

public class OtherItemList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_item_list);
    }

    public void item1OnClick(View view) {
        Intent iItem1 = new Intent(getApplicationContext(), OtherItem1Detail.class);
        startActivity(iItem1);
    }

    public void item2OnClick(View view) {
    }
}