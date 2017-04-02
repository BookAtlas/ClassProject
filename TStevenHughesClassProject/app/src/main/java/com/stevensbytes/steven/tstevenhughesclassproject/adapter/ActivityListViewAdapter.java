package com.stevensbytes.steven.tstevenhughesclassproject.adapter;

import android.content.ClipData;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.stevensbytes.steven.tstevenhughesclassproject.R;

import java.util.List;

/**
 * Created by Steven on 4/1/2017.
 */

public class ActivityListViewAdapter extends BaseAdapter {

    private final Context mContext;
    private final LayoutInflater mInflater;

    private ActivityInfo[] activities;

    public ActivityListViewAdapter(Context context) {
        mContext = context;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        try {
            activities = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_ACTIVITIES).activities;
        } catch(PackageManager.NameNotFoundException e){
            activities = null;
        }
    }

    @Override
    public int getCount() {
        if(activities != null){
            return activities.length;
        } else {
            return 0;
        }
    }

    @Override
    public Object getItem(int position) {
        return activities[position];
    }

    @Override
    public long getItemId(int position) {
        if(activities != null){
            return position;
        } else {
            return 0;
        }
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            convertView = mInflater.inflate(R.layout.list_adapter_activity, parent, false);
            holder = new ViewHolder();
            holder.textView = (TextView)convertView.findViewById(R.id.adapter_list_activity_text);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        ActivityInfo act = (ActivityInfo) this.getItem(position);
        String[] names = act.name.split("\\.");
        String name = names[names.length - 1];

        holder.textView.setText(String.valueOf(name));
        return convertView;
    }

}
