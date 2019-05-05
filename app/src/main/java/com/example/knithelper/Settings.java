package com.example.knithelper;

import android.graphics.Color;

public class Settings {
    public enum AppMode {
        KNIT,
        COLOR,
        COPY,
        MOVE,
        CUT
    }

    AppMode appState = AppMode.KNIT;
    Knit.knit knitState = Knit.knit.knit;
    int colorState = Color.BLACK;

}
