package com.adithyarachmat.e_commerce.Home.Electronics.Computers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.adithyarachmat.e_commerce.R;

public class ComputerList extends AppCompatActivity {

    private ImageView imgAsusRog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_list);
        imgAsusRog = findViewById(R.id.asusrog);
    }

    public void applemacOnClick(View view) {
    }

    public void asusrogOnClick(View view) {
        Intent iAsusRog = new Intent(getApplicationContext(), ComputerAsusRogDetails.class);
        startActivity(iAsusRog);
    }
}