package com.irfak.projectdikoding.activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.irfak.projectdikoding.R;
import com.irfak.projectdikoding.adapter.ListZodiakAdapter;
import com.irfak.projectdikoding.model.Star;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_URL = "imageUrl";
    private RecyclerView rvZodiak;
    private ArrayList<Zodiak> list = new ArrayList<>();
    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvZodiak = findViewById(R.id.rv_zodiak);
        rvZodiak.setHasFixedSize(true);

        list.addAll(ZodiakData.getListData());
        rvZodiak.setLayoutManager(new LinearLayoutManager(this));
        rvZodiak.setAdapter(new ListZodiakAdapter(list));
    }


    public void clickItem(Zodiak zodiak) {
        String strDate=zodiak.getDate(), strElemen=zodiak.getElemen(),  strSimbol=zodiak.getSimbol(), strDescription=zodiak.getDeskripsi();
        Intent intent = new Intent(this, ZodiakDetailActivity.class);
        Star star = new Star(strDate, strElemen, strSimbol, strDescription);
        intent.putExtra("tanggal", star.getStrDate());
        intent.putExtra("elemen", star.getStrElemen());
        intent.putExtra("simbol", star.getStrSimbol());
        intent.putExtra("desc", star.getStrDescription());
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.action_search){
            Intent intent = new Intent(this, Profile.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
