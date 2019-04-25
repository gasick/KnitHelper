package com.example.knithelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.nfc.Tag;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class PatternDraw extends View {

    Path path ;
    Paint p ;
    int xrows , ycolumns;
    int x=80;
    int y=80;
    int radius=40;
    Paint paint=new Paint();



    public PatternDraw(Context context, AttributeSet attrs) {

        super(context, attrs);
        int x=80;
        int y=80;
        int radius=40;
        Paint paint=new Paint();

        p = new Paint();
        p.setStrokeWidth(3);
        p.setStyle(Paint.Style.STROKE);
        path = new Path();
        xrows = 20;
        ycolumns=20;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawARGB(80, 255, 255, 255);

        // Use Color.parseColor to define HTML colors
        paint.setColor(Color.parseColor("#CD5C5C"));
        canvas.drawCircle(x,x, radius, paint);

        drawEditField();

        p.setColor(Color.BLACK);
        canvas.drawPath(path, p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("TOUCH", "test");
        Toast toast = Toast.makeText(getContext(),
                event.toString(), Toast.LENGTH_SHORT);
        toast.show();
        return super.onTouchEvent(event);



    }


    private void drawEditField() {
        //Рисуем сетку редактирования
        for (int j = 0; j < (1 + xrows) ; j ++ ) {
            path.moveTo(0, j*50 );
            path.lineTo(ycolumns*50, j*50 );
            path.close();
        }

        for (int i = 0;i < (1 + ycolumns) ;i ++)
        {
            path.moveTo(i*50 , 0);
            path.lineTo(i*50 , xrows*50);
            path.close();
        }
    }
}


