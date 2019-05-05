package com.example.lat3_akb2_10116072_zhafirahsakinahbaity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.MyViewHolder> {

    private Context mContext ;
     List<Galeri> galeriList;


    public GalleryAdapter(Context mContext, List<Galeri> galeriList) {
        this.mContext = mContext;
        this.galeriList = galeriList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.list_item_gallery,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,  int position) {
        Galeri galeri = galeriList.get(position);
        holder.img.setImageResource(galeri.getGambar());

    }

    @Override
    public int getItemCount() {
        return galeriList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

             img = itemView.findViewById(R.id.img_id);
        }
    }

}
