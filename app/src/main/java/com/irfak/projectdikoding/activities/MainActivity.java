package com.irfak.projectdikoding.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.irfak.projectdikoding.R;
import com.irfak.projectdikoding.adapter.ListZodiakAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvZodiak;
    private RecyclerView rv_zodiak;
    private ArrayList<Zodiak> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvZodiak = findViewById(R.id.rv_zodiak);
        rvZodiak.setHasFixedSize(true);

        list.addAll(ZodiakData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvZodiak.setLayoutManager(new LinearLayoutManager(this));
        ListZodiakAdapter listZodiakAdapter = new ListZodiakAdapter(list);
        rvZodiak.setAdapter(listZodiakAdapter);
    }
}
