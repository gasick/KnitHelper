package com.example.knithelper;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>{
    private LayoutInflater inflater;
    private List<Knit> knits;

    DataAdapter(Context context, List<Knit> knits){
        this.knits = knits;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = inflater.inflate(R.layout.knit_grid, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position){
        Knit knit = knits.get(position);
        holder.iView.setImageResource(knit.getImage());
        holder.nameView.setText(knit.getDescription());
        holder.descriptionView.setText(knit.getDescription());
    }

    @Override
    public int getItemCount(){
        return knits.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView iView;
        final TextView nameView, descriptionView;

        ViewHolder(View view){
            super(view);
            iView = view.findViewById(R.id.gridKnitImage);
            nameView = view.findViewById(R.id.gridKnitName);
            descriptionView = view.findViewById(R.id.gridKnitDescription);
        }
    }
}

public class ChooseKnitFragment extends Fragment  {


    List<Knit> knits = Knit.getKnitsList();



    public ChooseKnitFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RecyclerView rView = getActivity().findViewById(R.id.list);
        DataAdapter adapter = new DataAdapter(getContext(), knits);
        rView.setAdapter(adapter);
        return inflater.inflate(R.layout.fragment_choose_knit, container, false);
    }




    /*
     RecyclerView chooseknitRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_choose_knit, container, false);
        GridView gView = (GridView) getActivity().findViewById(R.id.gridview);
        adapter = new DataAdapter(getActivity(), R.layout.fragment_choose_knit);
        gView.setAdapter(adapter);



        String[] countrsList = new String[countrs.length];
        ArrayAdapter<String> adapter   = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, countrsList);
        (adapter);
        GridLayoutManager gLayoutManager = new GridLayoutManager(getActivity(), 2);
        chooseknitRecycler.setLayoutManager(gLayoutManager);
        return chooseknitRecycler;





        GridView cList = (GridView)getActivity().findViewById(R.id.gridview);


        ArrayAdapter<String> adapter   = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, countrs);
        cList.setAdapter(adapter);


        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        };
        cList.setOnItemClickListener(itemClickListener);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose_knit, container, false);

*/
}
