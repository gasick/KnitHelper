package com.example.knithelper;

import android.content.Intent;
import android.graphics.Canvas;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);


        //Создаем pager для отображения меню рисования
        SectionPagerAdapter pagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());
        ViewPager pager = findViewById(R.id.pager);
        pager.setAdapter(pagerAdapter);

        //Получаем данные от MainActivity чтобы создать новую схему.
        Intent intent = getIntent();
        int rows = Integer.parseInt(intent.getStringExtra("rows"));
        int columns = Integer.parseInt(intent.getStringExtra("columns"));
    }




    private class SectionPagerAdapter extends FragmentPagerAdapter {
        public SectionPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public int getCount(){
            return 3;
        }

        @Override
        public Fragment getItem(int position){
            switch(position){
                case 0: return new ChooseKnitFragment();
                case 1: return new ChooseColorFragment();
                case 2: return new FileSaveFragment();
            }
            return null;
        }
    }




}
