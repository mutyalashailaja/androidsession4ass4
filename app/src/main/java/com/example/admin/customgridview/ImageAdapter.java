package com.example.admin.customgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 15-10-2016.
 */
public class ImageAdapter extends BaseAdapter {


    private Context mContext;
    String[] result;
    public Integer[] mThumbIds;
    LayoutInflater layoutInflater;


    public ImageAdapter(Context mContext, String[] result, Integer[] mThumbIds) {
        this.mContext = mContext;
        this.result = result;
        this.mThumbIds = mThumbIds;
        this.layoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return result.length;


    }

    @Override
    public Object getItem(int position) {

        return result[position];

    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=layoutInflater.inflate(R.layout.list_view,parent,false);
        TextView tv=(TextView)view.findViewById(R.id.title);
        ImageView img=(ImageView)view.findViewById(R.id.imageID);
        tv.setText(result[position]);
        img.setImageResource(mThumbIds[position]);
        return view;
    }
}
