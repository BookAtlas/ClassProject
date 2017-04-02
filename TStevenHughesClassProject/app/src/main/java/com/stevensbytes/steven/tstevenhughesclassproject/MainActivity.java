package com.stevensbytes.steven.tstevenhughesclassproject;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.stevensbytes.steven.tstevenhughesclassproject.adapter.ActivityListViewAdapter;
import com.stevensbytes.steven.tstevenhughesclassproject.adapter.LRListViewAdapter;
import com.stevensbytes.steven.tstevenhughesclassproject.adapter.ListViewAdapter;
import com.stevensbytes.steven.tstevenhughesclassproject.lifecycle.ActivityA;

import java.util.List;

/**
 * Created by Steven on 2/12/2017.
 */

public class MainActivity extends AppCompatActivity {

    private ImageButton bt1;
    private ImageButton bt3;
    private ImageButton orangeButton;
    private ImageButton profileButton;
    private ActionBarDrawerToggle toggle;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        createDrawer();
        initialListener();
    }

    private void createDrawer() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        mDrawerList.setAdapter(new ActivityListViewAdapter(this));

        // set up the drawer's list view with items and click listener
//        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
//                R.layout.drawer_list_item, mPlanetTitles));
//        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
    }

    private void initialView(){
        bt1 = (ImageButton) findViewById(R.id.bt1);
        bt3 = (ImageButton) findViewById(R.id.bt3);
        orangeButton = (ImageButton) findViewById(R.id.orangeButton);
        profileButton = (ImageButton) findViewById(R.id.profileButton);
    }

    private void initialListener(){
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(v.getContext(), "Button 1 was clicked!!", Toast.LENGTH_LONG).show();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), ListViewActivity.class);
                startActivity(intent);
            }
        });
        orangeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), ActivityA.class);
                startActivity(intent);
            }
        });
        profileButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(mDrawerLayout.isDrawerOpen(Gravity.LEFT)){
                    mDrawerLayout.closeDrawer(Gravity.LEFT);
                }
                else {
                    mDrawerLayout.openDrawer(Gravity.LEFT);
                }
            }
        });
    }

    public void onClick(View v){
        Toast.makeText(this, "Button 2 was clicked!!", Toast.LENGTH_LONG).show();
    }

}
