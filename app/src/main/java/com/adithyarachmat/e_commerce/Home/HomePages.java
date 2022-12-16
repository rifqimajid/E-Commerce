package com.adithyarachmat.e_commerce.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.adithyarachmat.e_commerce.Admin.AdminPage;
import com.adithyarachmat.e_commerce.Home.Books.BookList;
import com.adithyarachmat.e_commerce.Home.ClothingAcc.ClothingFilter;
import com.adithyarachmat.e_commerce.Home.Electronics.ElectronicsCategoryProducts;
import com.adithyarachmat.e_commerce.Home.OtherItems.OtherItemList;
import com.adithyarachmat.e_commerce.R;

public class HomePages extends AppCompatActivity {
    private ImageView img1,img2,img3,img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pages);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);

    }

    //Membuat menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_kanan,menu);
        return true;
    }

    //Membuat pilihan menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.about)
        {
            startActivity(new Intent(HomePages.this, AdminPage.class));
        }

        return true;
    }

    public void ClothingOnClick(View view) {
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iClothingAcc = new Intent(getApplicationContext(), ClothingFilter.class);
                startActivity(iClothingAcc);
            }
        });
    }


    public void ElectronicsOnClick(View view) {
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iElectronics = new Intent(getApplicationContext(), ElectronicsCategoryProducts.class);
                startActivity(iElectronics);
            }
        });
    }

    public void BookOnClick(View view) {
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBook = new Intent(getApplicationContext(), BookList.class);
                startActivity(iBook);
            }
        });
    }

    public void OthersOnClcik(View view) {
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iOtherItem = new Intent(getApplicationContext(), OtherItemList.class);
                startActivity(iOtherItem);
            }
        });
    }
}