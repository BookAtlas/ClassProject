package com.stevensbytes.steven.tstevenhughesclassproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Steven on 2/12/2017.
 */

public class MainActivity extends AppCompatActivity {

    private ImageButton bt1;
    private ImageButton bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        initialListener();
    }

    private void initialView(){
        bt1 = (ImageButton) findViewById(R.id.bt1);
    }

    private void initialListener(){
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(v.getContext(), "Button 1 was clicked!!", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onClick(View v){
        Toast.makeText(this, "Button 2 was clicked!!", Toast.LENGTH_LONG).show();
    }

}
