package com.irfak.projectdikoding.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.irfak.projectdikoding.R;
import com.irfak.projectdikoding.activities.Zodiak;

import java.util.ArrayList;

public class ListZodiakAdapter extends RecyclerView.Adapter<ListZodiakAdapter.ListViewHolder>  {
    private ArrayList<Zodiak> listZodiak;
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
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Zodiak Zodiak = listZodiak.get(position);
        Glide.with(holder.itemView.getContext())
                .load(Zodiak.getPhoto())
                .apply(new RequestOptions().override(70, 70))
                .into(holder.imgPhoto);
        holder.tvName.setText(Zodiak.getName());
        holder.tvDate.setText(Zodiak.getDate());
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
}
