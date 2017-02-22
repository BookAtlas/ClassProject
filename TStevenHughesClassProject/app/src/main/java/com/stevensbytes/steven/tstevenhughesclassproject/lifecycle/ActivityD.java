package com.stevensbytes.steven.tstevenhughesclassproject.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.stevensbytes.steven.tstevenhughesclassproject.R;

/**
 * Created by Steven on 2/22/2017.
 */

public class ActivityD extends AppCompatActivity {

    private Button toA_button;
    private Button toB_button;
    private Button toC_button;
    private Button toD_button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        initialView();
        initialListener();
    }

    private void initialView(){
        toA_button = (Button) findViewById(R.id.toA);
        toB_button = (Button) findViewById(R.id.toB);
        toC_button = (Button) findViewById(R.id.toC);
        toD_button = (Button) findViewById(R.id.toD);
    }

    private void initialListener(){
        toA_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), ActivityA.class);
                startActivity(intent);
            }
        });
        toB_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), ActivityB.class);
                startActivity(intent);
            }
        });
        toC_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), ActivityC.class);
                startActivity(intent);
            }
        });
        toD_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), ActivityD.class);
                startActivity(intent);
            }
        });
    }
}
