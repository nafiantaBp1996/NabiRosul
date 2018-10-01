package com.example.nfnt.fragment_week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        NabiDetailFragment frag = (NabiDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailFrag);
        Bundle b = getIntent().getExtras();
        frag.setResep(b.getInt("id"));
        //frag.setResep(1);
    }
}
