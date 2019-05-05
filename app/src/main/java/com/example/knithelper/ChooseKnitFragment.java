package com.example.knithelper;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class ChooseKnitFragment extends Fragment  {

    public ChooseKnitFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RecyclerView chooseknitRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_choose_knit,
                container,
                false);
        int[] knitsImages = new int[Knit.knits.length];
        for(int i = 0; i<knitsImages.length; i++){
            knitsImages[i] = Knit.knits[i].getImageResourceId();
        }

        KnitAdapter adapter =  new KnitAdapter(knitsImages);
        chooseknitRecycler.setAdapter(adapter);
        GridLayoutManager lManager = new GridLayoutManager(getActivity(), 15);
        chooseknitRecycler.setLayoutManager(lManager);
        return chooseknitRecycler;
    }

}
