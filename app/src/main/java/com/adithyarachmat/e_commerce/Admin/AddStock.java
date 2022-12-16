package com.adithyarachmat.e_commerce.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.adithyarachmat.e_commerce.R;

public class AddStock extends AppCompatActivity {

    private Button btnAddQtt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_stock);

        btnAddQtt = findViewById(R.id.BTNaddqtt);

        btnAddQtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iAddQtt = new Intent(getApplicationContext(),AdminPage.class);
                startActivity(iAddQtt);
            }
        });
    }
}