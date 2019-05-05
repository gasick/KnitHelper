package com.example.knithelper;


import java.util.ArrayList;
import java.util.List;

public class Knit {
    // name - название петли
    // image - изображение петли
    // description - описание петли
    private String name;
    private int image;
    private int description;


    //Создание массива петель для использования в редактировании
    public static final Knit[] knits = {
            new Knit("k2tog", R.drawable.k2tog,R.string.k2tog),
            new Knit("knit", R.drawable.knit,R.string.knit),
            new Knit("ktbl", R.drawable.ktbl,R.string.ktbl),
            new Knit("lsi", R.drawable.lsi,R.string.lsi),
            new Knit("p2tog", R.drawable.p2tog,R.string.p2tog),
            new Knit("ptbl", R.drawable.ptbl,R.string.ptbl),
            new Knit("purl", R.drawable.purl,R.string.purl),
            new Knit("rsi", R.drawable.rsi,R.string.rsi),
            new Knit("s2kp2", R.drawable.s2kp2,R.string.s2kp2),
            new Knit("s2pp2", R.drawable.s2pp2,R.string.s2pp2),
            new Knit("ssk", R.drawable.ssk,R.string.ssk),
            new Knit("ssp", R.drawable.ssp,R.string.ssp),
            new Knit("yo", R.drawable.yo,R.string.yo)
    };

    //Создание енума для типа петель
    enum knit{ k2tog, knit, ktbl, lsi, p2tog,  ptbl,purl,rsi,s2kp2,s2pp2,ssk,ssp,yo}


    //Конструктор петли: имя, изображение, описание
    public Knit(String name, int image, int description){
        this.name = name;
        this.image = image;
        this.description = description;
    }



    public String getName(){
        return this.name;
    }

    public int getDescription(){
        return this.description;
    }

    public int getImageResourceId() {
        return image;
    }
}
