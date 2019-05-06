package com.example.knithelper;

import android.util.Log;
import com.example.knithelper.Knit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Pattern {

    //Параметры поля редактирования
    float currentX;
    float currentY;
    int displayHeight;
    int displayWidth;
    private int picWidth;
    private int picHeight;
    float magnifier = 1f;
    int widthSizeOfaPic;
    int heightSizeOfaPic;


    //Параметры рисунка
    Knit.knit[][] pattern; // схема рисунка
    float picStartx = 0;
    float picStarty = 0;
    private int rows;
    private int columns;




    //конструктор класса задает пустой рисунок размером x, y
    Pattern(int x, int y, int picWidth_, int picHeight_) {
        rows = x;
        columns = y;
        pattern = new Knit.knit[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                pattern[i][j] = Knit.knit.empty;
            }
        }
        Log.i("Pattern value", Arrays.deepToString(getPattern()));
        Log.i("Cell ILS value", Knit.knit.lsi.toString());
        Log.i("Cell value", Knit.knit.values()[0].toString());

        picWidth = picWidth_;
        picHeight = picHeight_;
        widthSizeOfaPic = (int) (picWidth * magnifier);
        heightSizeOfaPic = (int) (picHeight * magnifier);
    }


    // Из файла
    /*
    Pattern(int picWidth_, int picHeight_, String fileName) {
        ArrayList<String> inputFile = FileWork.openFile(fileName);
        Log.i("File path", fileName);
        rows = inputFile.size();
        Log.i("FIRLt line", inputFile.get(0));
        String[] testlength = inputFile.get(0).split(",");
        Log.i("testlength", testlength.toString());
        columns = testlength.length;
        pattern = new cell[rows][columns];
        Log.i("Pattern value", Arrays.deepToString(getPattern()));
        for (int i = 0; i < rows; i++) {
            String[] line = inputFile.get(i).split(",");
            Log.i("Array string", Arrays.toString(line));
            Log.i("Cell value", line[0]);
            for (int j = 0; j < columns; j++) {
                Log.i("Cell value", line[j]);
                pattern[i][j] = cell.getCellValue(line[j]);
                Log.i("pattern value", cell.getCellValue(line[j]).toString());
                Log.i("pattern value", pattern[i][j].toString());
            }
        }
        Log.i("Pattern value", Arrays.deepToString(getPattern()));
        picWidth = picWidth_;
        picHeight = picHeight_;
        widthSizeOfaPic = (int) (picWidth * magnifier);
        heightSizeOfaPic = (int) (picHeight * magnifier);
    }
*/


    /*
    //история действий над рисунком
    Stack<Knit.knit[][]> history = new Stack<>();
    Stack<Knit.knit[][]> tempHistory = new Stack<>();

    public void addHistory() {
        history.push(pattern);
        Log.i("add History", "history.add");
        int iii = history.size();
        Log.i("History size", String.valueOf(iii));
        String temp = "";
        String temp1 = "";
        String temp2 = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                temp += "({" + i + "," + j + "," + pattern[i][j] + "})";
            }
        }
        Log.i("History pattern", temp);
        for (int y = 0; y < history.size(); y++) {
            cell[][] h = (cell[][]) history.elementAt(y);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    temp1 += "({" + i + "," + j + "," + h[i][j] + "})";

                }
            }

            Log.i("History h", temp1);
            temp1 = "";
        }


        tempHistory.clear();
        Log.i("add History", "tempHistory.clear");
    }

    public void historyUndo() {
        if (!history.empty()) {
            tempHistory.push(history.pop());
            pattern = (cell[][]) history.peek();
        }
    }

    public void historyRedo() {
        int i = tempHistory.size();
        if (i >= 1) {
            Log.i("historyUndo", "tempHistory.size()");
            pattern = (cell[][]) tempHistory.get(i - 1);
            Log.i("historyUndo", "pattern = tempHistory.get");
            history.add(tempHistory.get(i - 1));
            Log.i("historyUndo", "history.add(tempHistory.get(");
            tempHistory.remove(i - 1);
            Log.i("historyUndo", "tempHistory.remove(");
        }
    }
    */

    public void updatePattern(Knit.knit[][] patt) {

    }

    //получае схему рисунка
    public Knit.knit[][] getPattern() {
        return pattern;
    }

    //Изменяем схему рисунка
    public void changePatternCell(int x, int y, Knit.knit k) {
        /*
        history.push(getPattern());

        Log.i("History full value", String.valueOf(history));

        String temp2 = "";
        for (int i = 0; i < 5; i++) {
            int j = 0;
            Knit.knit[][] h = (Knit.knit[][]) history.peek();
            Log.i("History h.peek", "({" + i + "," + j + "," + h[i][j] + "})");

        }
        for (Knit.knit[][] kkk : history) {
            String temp = "";
            for (int i = 0; i < 5; i++) {
                int j = 0;
                temp += "({" + i + "," + j + "," + kkk[i][j] + "})";

            }
            Log.i("History h.elementAt", temp);
        }
        for (int xx = 0; xx < history.size(); xx++) {

        }
        */
        pattern[x][y] = k;

    }

    //Получаем количество рядов схемы
    public int getRows() {
        return rows;
    }

    //Получаем количество петель схемы
    public int getColumns() {
        return columns;
    }
}

