package com.example.knithelper;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

public class KnitAdapter extends RecyclerView.Adapter<KnitAdapter.ViewHolder> {
    private int[] imageIds;

    public KnitAdapter(int [] imageIds){
        this.imageIds = imageIds;
    }

    @Override
    public  int getItemCount(){
        return imageIds.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView v){
            super(v);
            cardView = v;
        }
    }

    @Override
    public KnitAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent,
            int viewType){
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.knit_card, parent, false);
        return new ViewHolder(cv);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        CardView cardView = holder.cardView;
        ImageView iView = cardView.findViewById(R.id.knit_card_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        iView.setImageDrawable(drawable);
    }
}
