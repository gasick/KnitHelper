package com.example.knithelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Собираем данные которые передадим в новое окно
    EditText rows;
    EditText columns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rows = findViewById(R.id.rows);
        columns = findViewById(R.id.columns);
    }

    public void onCreateButtonClik(View view) {
        Intent intent = new Intent(this, EditActivity.class);
        intent.putExtra("rows", rows.getText().toString() );
        intent.putExtra("columns", columns.getText().toString());
        startActivity(intent);
    }
}
