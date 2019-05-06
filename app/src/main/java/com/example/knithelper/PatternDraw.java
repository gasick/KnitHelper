package com.example.knithelper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
    Paint paint=new Paint();
    Pattern pattern;



    public PatternDraw(Context context, Pattern patt) {

        super(context);
        Pattern pattern;
        p = new Paint();
        p.setStrokeWidth(3);
        p.setStyle(Paint.Style.STROKE);
        path = new Path();
        pattern = patt;
        xrows = pattern.getRows();
        ycolumns = pattern.getColumns();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawARGB(80, 255, 255, 255);
        pattern.displayWidth = getWidth();
        pattern.displayHeight = getHeight();
        Knit.knit[][] patt = pattern.getPattern();
        //очистка path
        path.reset();

        //рисуем палитру и меню
        drawEditField();
        drawPattern(pattern, canvas);
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

    private void drawPattern(Pattern patt, Canvas canvas) {
        //рисуем схему на канве
        //иходник находится в  pattern
        Knit.knit[][] p = patt.getPattern();
        for (int i = 0; i < xrows; i++) {
            for (int j = 0; j < ycolumns; j++) {
                if (p[i][j] != Knit.knit.empty) {
                    printKnit
                            (
                                    i * pattern.widthSizeOfaPic + pattern.picStartx,
                                    j * pattern.heightSizeOfaPic + pattern.picStarty,
                                    p[i][j],
                                    canvas
                            );
                }
            }
        }
    }


    public void printKnit(float x, float y, Knit.knit k, Canvas canvas) {
        //Получаем от getRDrawablePNG что за рисунок рисуем его
        Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), Knit.knit.getRDrawablePNG(k));
        Bitmap updatedmBitmap = Bitmap.createScaledBitmap(
                mBitmap,(int)(pattern.widthSizeOfaPic),
                (int)(pattern.heightSizeOfaPic),
                false);
        canvas.drawBitmap(updatedmBitmap,x,y,null);

    }
}


