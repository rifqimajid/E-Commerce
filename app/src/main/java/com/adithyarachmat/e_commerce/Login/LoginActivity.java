package com.adithyarachmat.e_commerce.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.adithyarachmat.e_commerce.Home.Books.BookList;
import com.adithyarachmat.e_commerce.Home.HomePages;
import com.adithyarachmat.e_commerce.R;

public class LoginActivity extends AppCompatActivity {
    private Button btnCreateAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnCreateAcc = findViewById(R.id.BTNcrtaccount);

        btnCreateAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iToHomePages = new Intent(getApplicationContext(), HomePages.class);
                startActivity(iToHomePages);
            }
        });
    }
}