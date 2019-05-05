package com.example.lat3_akb2_10116072_zhafirahsakinahbaity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DailyFriendFragment extends Fragment {


    public DailyFriendFragment() {
        // Required empty public constructor
    }

    List<Friend> friendList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.list_item_friend, container, false);

        RecyclerView myrv = view.findViewById(R.id.rv_friend);
        FriendAdapter myAdapter = new FriendAdapter(getContext(), friendList);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);
        initData();
        return view;
    }

    private void initData() {
        friendList= new ArrayList<>();
        friendList.add(new Friend("Rima",R.drawable.teman2));
        friendList.add(new Friend("Aini",R.drawable.teman3));
        friendList.add(new Friend("Aghniya",R.drawable.teman4));
        friendList.add(new Friend("Anisa",R.drawable.teman1));
    }


}
