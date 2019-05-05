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
import android.widget.Toast;


import java.util.List;

public class ChooseKnitFragment extends Fragment  {

    public ChooseKnitFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int[] knitsImages = new int[Knit.knits.length];
        for(int i = 0; i<knitsImages.length; i++){ knitsImages[i] = Knit.knits[i].getImageResourceId();}
        final Knit[] knits = new Knit[Knit.knits.length];
        for(int i = 0; i<knits.length; i++){ knits[i] = Knit.knits[i];}
        RecyclerView chooseknitRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_choose_knit,
                container,
                false);

        KnitAdapter adapter =  new KnitAdapter(knitsImages);
        chooseknitRecycler.setAdapter(adapter);
        GridLayoutManager lManager = new GridLayoutManager(getActivity(), 15);
        chooseknitRecycler.setLayoutManager(lManager);
        adapter.setListener(new KnitAdapter.Listener(){
            public void onClick(int position){
                Knit knit = knits[position];
                Toast toast = Toast.makeText(
                        getContext(),
                        knit.getDescription(),
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        return chooseknitRecycler;
    }

}
