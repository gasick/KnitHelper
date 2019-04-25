package com.example.knithelper;


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChooseKnitFragment extends Fragment  {


    public ChooseKnitFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        RecyclerView stitchesRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_choose_knit, container,false);


        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(R.string.k2tog, R.drawable.k2tog);
        stitchesRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 1);
        return stitchesRecycler;
*/

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose_knit, container, false);
    }
}
