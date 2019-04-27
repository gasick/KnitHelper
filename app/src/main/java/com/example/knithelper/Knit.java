package com.example.knithelper;


import java.util.ArrayList;
import java.util.List;

public class Knit {
    private String name;
    private int image;
    private int description;

    public Knit(String name, int image, int description){
        this.name = name;
        this.image = image;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getImage(){
        return this.image;
    }

    public void setImage(int image){
        this.image = image;
    }

    public int getDescription(){
        return this.description;
    }

    public void setDescription(int description){
        this.description = description;
    }

    public static List<Knit> getKnitsList(){
        List<Knit> knits = new ArrayList<>();
        knits.add(new Knit("k2tog", R.drawable.k2tog, R.string.k2tog));
        knits.add(new Knit("knit", R.drawable.knit, R.string.knit));
        knits.add(new Knit("ktbl", R.drawable.ktbl, R.string.ktbl));
        knits.add(new Knit("lsi", R.drawable.lsi, R.string.lsi));
        knits.add(new Knit("p2tog", R.drawable.p2tog, R.string.p2tog));
        return knits;
    }


}
