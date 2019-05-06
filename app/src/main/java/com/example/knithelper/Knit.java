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
    public enum knit{
        k2tog, knit, ktbl, lsi, p2tog,  ptbl,purl,rsi,s2kp2,s2pp2,ssk,ssp,yo, empty;

        public static knit getKnitValue(String str) {
            return knit.valueOf(str.trim());
        }

        //на запрос пользователя о том, что это за Cell
        //возвращаем значение рисунка png из drawable
        public static int getRDrawablePNG(Knit.knit k) {
            switch (k) {
                case k2tog: return R.drawable.k2tog;
                case ktbl: return R.drawable.ktbl;
                case lsi: return R.drawable.lsi;
                case p2tog: return R.drawable.p2tog;
                case ptbl: return R.drawable.ptbl;
                case rsi: return R.drawable.rsi;
                case purl: return R.drawable.purl;
                case knit: return R.drawable.knit;
                case s2kp2: return R.drawable.s2kp2;
                case s2pp2: return R.drawable.s2pp2;
                case ssk: return R.drawable.ssk;
                case ssp: return R.drawable.ssp;
                case yo: return R.drawable.yo;
                default: return -1;
            }
        }

        public static String getCellString(Knit.knit k) {
            switch (k) {
                case k2tog: return "k2tog";
                case knit: return "knit";
                case ktbl: return "ktbl";
                case lsi: return "lsi";
                case p2tog: return "p2tog";
                case ptbl: return "ptbl";
                case purl: return "purl";
                case rsi: return "rsi";
                case s2kp2: return "s2kp2";
                case s2pp2: return "s2pp2";
                case ssk: return "ssk";
                case ssp: return "ssp";
                case yo: return "yo";
                default: return "empty";
            }
        }


    }


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
