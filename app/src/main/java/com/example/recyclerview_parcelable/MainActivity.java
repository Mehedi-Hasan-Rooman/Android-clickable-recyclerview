package com.example.recyclerview_parcelable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Example_Item> mExampleList;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createExampleList();
        buildRecyclerView();
    }



    private void createExampleList() {
        mExampleList = new ArrayList<>();
        mExampleList.add(new Example_Item(R.drawable.ic_a,"Love You" ,"Hate you"));
        mExampleList.add(new Example_Item(R.drawable.ic_2, "Line 3", "Line 4"));
        mExampleList.add(new Example_Item(R.drawable.ic_3, "Line 5", "Line 6"));
        mExampleList.add(new Example_Item(R.drawable.ic_4, "Line 7", "Line 8"));
        mExampleList.add(new Example_Item(R.drawable.ic_5, "Line 9", "Line 10"));
        mExampleList.add(new Example_Item(R.drawable.ic_6, "Line 11", "Line 12"));
        mExampleList.add(new Example_Item(R.drawable.ic_7, "Line 13", "Line 14"));
        mExampleList.add(new Example_Item(R.drawable.ic_8, "Line 15", "Line 16"));
        mExampleList.add(new Example_Item(R.drawable.ic_9, "Line 17", "Line 18"));
        mExampleList.add(new Example_Item(R.drawable.ic_10, "Line 19", "Line 20"));

    }

    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("Example Item", mExampleList.get(position));
                startActivity(intent);
            }
        });
    }
}
