package com.example.admin.customgridview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    Context mContext;
    ArrayList result;
    public static String[] resultList={"GingerBread","HoneyComb","JellyBean","KitKat","Lollipop","IcecreamSandwidtch"};
    public static Integer[] mThumbIds={R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,
    R.drawable.icecreamsandwidtch};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this, resultList,mThumbIds));
    }
    }

