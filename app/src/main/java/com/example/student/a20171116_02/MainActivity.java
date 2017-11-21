package com.example.student.a20171116_02;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    myAdapter adapter;
    list1[] data = {
            new list1("台北", "02", R.drawable.n1),
            new list1("台中", "04", R.drawable.n2),
            new list1("高雄", "07", R.drawable.n3)
    };
    //String strArray[] = {"q1","w2","e3","r4","t5","y6","u7","i8","o9","p10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        adapter = new myAdapter(MainActivity.this, data);
        lv.setAdapter(adapter);
    }
}
