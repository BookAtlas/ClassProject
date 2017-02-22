package com.stevensbytes.steven.tstevenhughesclassproject;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.stevensbytes.steven.tstevenhughesclassproject.adapter.LRListViewAdapter;
import com.stevensbytes.steven.tstevenhughesclassproject.adapter.ViewPagerAdapter;
import com.stevensbytes.steven.tstevenhughesclassproject.adapter.ViewPagerStateAdapter;
import com.stevensbytes.steven.tstevenhughesclassproject.fragment.ImageFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Steven on 2/18/2017.
 */

public class Hw3Activity extends AppCompatActivity {

    private ListView listView;
    private LRListViewAdapter mAdapter;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_list);
        initialView();
    }

    private void initialView() {
        listView = (ListView) findViewById(R.id.list_view);

        if(mAdapter == null){
            mAdapter = new LRListViewAdapter(this);
        }

        View view = getLayoutInflater().inflate(R.layout.list_head_tabs,null);
        listView.addHeaderView(view);
        listView.setAdapter(mAdapter);

        ImageFragment imgFrag1 = new ImageFragment(),
                imgFrag2 = new ImageFragment(),
                imgFrag3 = new ImageFragment();

        Bundle args = new Bundle();
        args.putInt("image id", R.mipmap.slow);

        imgFrag1.setArguments(args);

        fragmentList.add(imgFrag1);

        args = new Bundle();
        args.putInt("image id", R.mipmap.pika);

        imgFrag2.setArguments(args);

        fragmentList.add(imgFrag2);

        args = new Bundle();
        args.putInt("image id", R.mipmap.umbr);

        imgFrag3.setArguments(args);

        fragmentList.add(imgFrag3);


        ViewPager viewPager = (ViewPager) findViewById(R.id.vp);
//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        ViewPagerStateAdapter viewPagerAdapter = new ViewPagerStateAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);

    }
}



