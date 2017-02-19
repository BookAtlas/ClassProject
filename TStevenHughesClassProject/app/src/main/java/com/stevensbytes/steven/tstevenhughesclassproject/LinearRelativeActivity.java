package com.stevensbytes.steven.tstevenhughesclassproject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.stevensbytes.steven.tstevenhughesclassproject.adapter.LRListViewAdapter;

import static android.graphics.Color.*;

public class LinearRelativeActivity extends Activity implements AdapterView.OnItemClickListener {
    private ImageButton bt1;
    private ImageButton bt2;
    private ImageButton bt5;
    private ListView listView;

    private LRListViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_relative_layout);
        initialView();
        setListener();
    }

    private void initialView() {
        bt1 = (ImageButton)findViewById(R.id.lrl_bt1);
        bt5 = (ImageButton)findViewById(R.id.lrl_bt5);
        listView = (ListView)findViewById(R.id.lr_list_view);

        if (mAdapter==null){
            mAdapter = new LRListViewAdapter(this);
        }
        View view = getLayoutInflater().inflate(R.layout.list_head_view,null);
        listView.addHeaderView(view);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(this);
    }


    private void setListener() {
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Button1 was clicked",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), ViewPagerActivity.class);
                startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Hw3Activity.class);
                startActivity(intent);
            }
        });
    }

    /** Called when the user clicks the Send button */
    public void onClick(View view) {
        // Do something in response to button
        Toast.makeText(view.getContext(),"Button2 was clicked",Toast.LENGTH_LONG).show();
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "listview was clicked at " + position, Toast.LENGTH_SHORT).show();
    }
}
