package com.example.tugasrecyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasrecyclerview.R;
import com.example.tugasrecyclerview.models.DataTextGambar;

import java.util.List;

public class DataTextGambarAdapter extends RecyclerView.Adapter<DataTextGambarAdapter.MyViewHolder> {
    List<DataTextGambar> mobilList;

    public DataTextGambarAdapter(List<DataTextGambar> mobilList) {
        this.mobilList = mobilList;
    }

    @NonNull
    @Override
    public DataTextGambarAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemMobilView = layoutInflater.inflate(R.layout.item_mobil,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(itemMobilView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataTextGambarAdapter.MyViewHolder holder, int position) {
        //ambil satu item hero
        DataTextGambar mobil = mobilList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.mobilName.setText(mobil.getNamaMobil());
        holder.gambar.setImageResource(mobil.getUrutanMobil());
    }

    @Override
    public int getItemCount()    {
        return (mobilList != null) ? mobilList.size() : 0;
        /*for non shorthand people*/
        /*if(heroList!=null){
          return heroList.size();
        }else{
          return 0;
        }*/
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mobilName;
        public ImageView gambar;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mobilName = itemView.findViewById(R.id.mobilName);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }
}
