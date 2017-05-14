package com.example.tantriayup.pizzafrenzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class TopMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_menu);

    }

    public void onClickPesan(View v) {
        Intent i = new Intent(this, OrderActivity.class);
        startActivity(i); // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickPesan
    }
}