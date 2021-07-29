package com.example.recyclerviewtutorial_1.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtutorial_1.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String[] title, description;
    int[] images;

    public MyAdapter(Context context, String[] title, String[] description, int[] images) {
        this.context = context;
        this.title = title;
        this.description = description;
        this.images = images;
    }

    @NonNull
   // @org.jetbrains.annotations.NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_layout, parent,  false );

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.title.setText(title[position]);
        holder.description.setText(description[position]);
        holder.flag.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title, description;
        ImageView flag;
        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            title = itemView.findViewById(R.id.tvContryName);
            description = itemView.findViewById(R.id.tvCountryDescription);
            flag = itemView.findViewById(R.id.imgvFlag);

        }
    }
}
