package com.stevensbytes.steven.tstevenhughesclassproject;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.HeaderViewListAdapter;
import android.support.v4.view.ViewPager;
import android.widget.ListView;

import com.stevensbytes.steven.tstevenhughesclassproject.adapter.ListViewAdapter;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initialView();
    }
    private void initialView() {
        listView = (ListView) findViewById(R.id.list_view);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this);
        listView.setAdapter(listViewAdapter);

    }




}
