package com.irfak.projectdikoding.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.irfak.projectdikoding.R;
import com.irfak.projectdikoding.adapter.ListZodiakAdapter;

public class Profile extends AppCompatActivity {
    private RecyclerView profil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

    }
}
