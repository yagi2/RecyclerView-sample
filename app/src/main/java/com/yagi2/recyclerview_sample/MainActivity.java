package com.yagi2.recyclerview_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.Listener {

    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Horizontal List
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        mRecyclerView.setLayoutManager(linearLayoutManager);

        // GridView
//        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }

    @Override
    protected void onResume() {
        super.onResume();

        ArrayList<String> data = new ArrayList<>();
        data.add("うなすけ");
        data.add("やぎにい");
        data.add("アドベントカレンダー");
        data.add("やっていき！");

        mRecyclerViewAdapter = new RecyclerViewAdapter(this, data, this);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
    }

    @Override
    public void onRecyclerClicked(View v, int position) {
        TextView textView = (TextView)v.findViewById(R.id.text);
        Toast.makeText(this, textView.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
