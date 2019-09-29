package com.irfak.projectdikoding.adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.irfak.projectdikoding.R;
import com.irfak.projectdikoding.activities.MainActivity;
import com.irfak.projectdikoding.activities.Zodiak;
import com.irfak.projectdikoding.activities.ZodiakData;
import com.irfak.projectdikoding.activities.ZodiakDetailActivity;
import com.irfak.projectdikoding.model.Star;

import java.util.ArrayList;

public class ListZodiakAdapter extends RecyclerView.Adapter<ListZodiakAdapter.ListViewHolder>  {
    private ArrayList<Zodiak> listZodiak;
    private View itemView;

    public ListZodiakAdapter(ArrayList<Zodiak> list) {
        this.listZodiak=list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_zodiak_list_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Zodiak zodiak = listZodiak.get(position);
        Glide.with(holder.itemView.getContext())
                .load(zodiak.getPhoto())
                .apply(new RequestOptions().override(50, 50))
                .into(holder.imgPhoto);
        holder.tvName.setText(zodiak.getName());
        holder.tvDate.setText(zodiak.getDate());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(),itemView.getId(),Toast.LENGTH_SHORT).show();
            }
        });
    }



    @Override
    public int getItemCount() {
        return listZodiak.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDate;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ImageView);
            tvName = itemView.findViewById(R.id.TextViewName);
            tvDate = itemView.findViewById(R.id.TextViewDate);


        }
    }

    public void bind(final Zodiak zodiak, final Onclick onModelClick){

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onModelClick.clickItem(zodiak);
            }
        });
    }
    public interface Onclick {
        void clickItem(Zodiak zodiak);
    }
}
