package com.example.lat3_akb2_10116072_zhafirahsakinahbaity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.MyViewHolder>{

    private Context mContext ;
    private List<Friend> friendList;


    public FriendAdapter(Context mContext, List<Friend> friendList) {
        this.mContext = mContext;
        this.friendList = friendList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.list_item_friend,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Friend friend = friendList.get(position);
        holder.name.setText(friend.getFriendName());
        holder.img.setImageResource(friend.getFriendImg());

    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name;

        public MyViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image_view);
            name = itemView.findViewById(R.id.name);


        }
    }

}
