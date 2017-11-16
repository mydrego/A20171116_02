package com.example.student.a20171116_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by student on 2017/11/16.
 */

public class myAdapter extends BaseAdapter {
    Context context;
    //String[] strArray;
    list1[] data;

    public myAdapter(Context context, list1[] data) {
        this.context = context;
        //this.strArray = strArray;
        this.data = data;
    }

    @Override
    public int getCount() {
        //return 100;
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.mylayout, null);
        TextView tv = (TextView) v.findViewById(R.id.textView);
        TextView tv2 = (TextView) v.findViewById(R.id.textView2);
        tv.setText(data[i].aaa);
        tv2.setText(data[i].bbb);
        return v;
    }
}
