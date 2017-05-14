package com.creativeerror.finalproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by User on 14/05/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List <Model> bahasalist;
    Context context;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nama;
        ImageView gambar;
        LinearLayout layout;

        public MyViewHolder(View view) {
            super(view);
            gambar = (ImageView) view.findViewById(R.id.gambar);
            nama = (TextView) view.findViewById(R.id.nama);
            layout= (LinearLayout) view.findViewById(R.id.layout);


        }
    }


    public Adapter(Context context, List <Model>  bahasalist) {
        this. bahasalist=  bahasalist;
        this.context= context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final Model bahasa = bahasalist.get(position);
        holder.nama.setText(bahasa.getNamaIndo());
        holder.gambar.setImageResource(bahasa.getGambar());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,bahasa.getNamaEng(),Toast.LENGTH_LONG).show();
            }
        });
    }

         @Override
            public int getItemCount() {return bahasalist.size();}


}

