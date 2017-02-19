package com.stevensbytes.steven.tstevenhughesclassproject;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.stevensbytes.steven.tstevenhughesclassproject.adapter.ViewPagerAdapter;
import com.stevensbytes.steven.tstevenhughesclassproject.adapter.ViewPagerStateAdapter;
import com.stevensbytes.steven.tstevenhughesclassproject.fragment.ContentFragment;
import com.stevensbytes.steven.tstevenhughesclassproject.fragment.HistoryFragment;
import com.stevensbytes.steven.tstevenhughesclassproject.fragment.LoginFragment;

import java.util.ArrayList;
import java.util.List;



public class ViewPagerActivity extends AppCompatActivity {

    private ArrayList<Fragment> fragmentList= new ArrayList<Fragment>();
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        initialView();
    }

    private void initialView() {
        ContentFragment contentFragment = new ContentFragment();
        fragmentList.add(contentFragment);
        fragmentList.add(new LoginFragment());
        fragmentList.add(new HistoryFragment());

        ViewPager viewPager = (ViewPager) findViewById(R.id.vp);
//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        ViewPagerStateAdapter viewPagerAdapter = new ViewPagerStateAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);

    }


}