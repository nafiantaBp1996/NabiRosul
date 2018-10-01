package com.example.nfnt.fragment_week2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }
    public void clickMasuk(View v)
    {
        Intent in = new Intent(this,MainActivity.class);
        startActivity(in);
    }


}
