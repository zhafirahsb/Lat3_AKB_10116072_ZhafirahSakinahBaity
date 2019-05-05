package com.example.lat3_akb2_10116072_zhafirahsakinahbaity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {

    public GalleryFragment() {
        // Required empty public constructor

    }

    List<Galeri> galeriList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_gallery, container, false);

        RecyclerView myrv = view.findViewById(R.id.rv_gallery);
        GalleryAdapter myAdapter = new GalleryAdapter(getContext(), galeriList);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);
        initData();
        return view;
    }
    public void initData(){
         galeriList= new ArrayList<>();
        galeriList.add(new Galeri(R.drawable.gallery1));
        galeriList.add(new Galeri(R.drawable.gallery2));
        galeriList.add(new Galeri(R.drawable.gallery3));
        galeriList.add(new Galeri(R.drawable.gallery4));
        galeriList.add(new Galeri(R.drawable.gallery5));


    }
}
