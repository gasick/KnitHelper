package com.example.knithelper;

import android.graphics.Color;

//Класс настроек и состояния программы.
public class Settings {

    //Режим редактирования
    public enum AppEditMode {
        KNIT,
        COLOR,
        COPY,
        MOVE,
        CUT
    }

    //Состояние программы
    AppEditMode appState = AppEditMode.KNIT;
    Knit.knit knitState = Knit.knit.knit;
    int colorState = Color.BLACK;

}
