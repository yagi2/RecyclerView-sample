package com.yagi2.recyclerview_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onResume() {
        super.onResume();

        ArrayList<String> data = new ArrayList<>();
        data.add("うなすけ");
        data.add("やぎにい");
        data.add("アドベントカレンダー");

        mRecyclerViewAdapter = new RecyclerViewAdapter(this, data);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
    }
}
