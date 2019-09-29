package com.irfak.projectdikoding.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.irfak.projectdikoding.R;
import com.irfak.projectdikoding.adapter.ListZodiakAdapter;
import com.squareup.picasso.Picasso;
import static com.irfak.projectdikoding.activities.MainActivity.EXTRA_URL;

public class ZodiakDetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView tvDate, tvElemen, tvSimbol,tvDescription;
    private View itemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_zodiak_detail);

        imageView  = findViewById(R.id.iv_img);
        tvDate= findViewById(R.id.tv_date);
        tvElemen= findViewById(R.id.tv_elemen);
        tvSimbol = findViewById ( R.id.tv_simbol);
        tvDescription= findViewById(R.id.tv_desc);


        tvDate.setText(getIntent().getStringExtra("tanggal"));
        tvElemen.setText(getIntent().getStringExtra("elemen"));
        tvSimbol.setText ( getIntent ().getStringExtra ( "simbol" ) );
        tvDescription.setText(getIntent().getStringExtra("deskripsi"));
        String image = getIntent().getStringExtra(EXTRA_URL);
        Picasso.get().load(image).into(imageView);

    }
    public void bind(final Zodiak zodiak, final Onclick onModelClick){

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onModelClick.clickItem(zodiak);
            }
        });
    }

    public void ImageID(View view) {
        Intent klik = new Intent(this, ZodiakDetailActivity.class);
        startActivity(klik);
    }

    public interface Onclick {
        void clickItem(Zodiak zodiak);
    }
}

