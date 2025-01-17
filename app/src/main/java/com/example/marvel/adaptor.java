package com.example.marvel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class adaptor extends  RecyclerView.Adapter<adaptor.MyViewHolder>{

    private Context context;
    private List<scroll> scrolls;

    public adaptor(Context context, List<scroll> scrolls) {
        this.context = context;
        this.scrolls = scrolls;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView mImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mImage = itemView.findViewById(R.id.image);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout_list_item,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        scroll slide = scrolls.get(position);
        holder.mImage.setImageResource(slide.getImage());


    }

    @Override
    public int getItemCount() {
        return scrolls.size();
    }
}