package com.example.seyirdefteri.Adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.seyirdefteri.Domains.Cast;
import com.example.seyirdefteri.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CastListAdapter extends RecyclerView.Adapter<CastListAdapter.Viewholder> {

    ArrayList<Cast> casts;
    Context context;

    public CastListAdapter(ArrayList<Cast> casts) {
        this.casts = casts;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_actors,parent,false);
        return new Viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Glide.with(context)
                .load(casts.get(position).getPicUrl())
                .into(holder.pic);

        holder.nameTxt.setText(casts.get(position).getActor());


    }



    @Override
    public int getItemCount() {
        return casts.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        ImageView pic;
        TextView nameTxt;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            pic = itemView.findViewById(R.id.itemImage);
            nameTxt = itemView.findViewById(R.id.nameTxt);
        }
    }
}
