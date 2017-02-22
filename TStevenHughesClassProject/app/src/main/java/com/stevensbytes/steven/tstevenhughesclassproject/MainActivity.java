package com.stevensbytes.steven.tstevenhughesclassproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.stevensbytes.steven.tstevenhughesclassproject.lifecycle.ActivityA;

/**
 * Created by Steven on 2/12/2017.
 */

public class MainActivity extends AppCompatActivity {

    private ImageButton bt1;
    private ImageButton bt3;
    private ImageButton orangeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        initialListener();
    }

    private void initialView(){
        bt1 = (ImageButton) findViewById(R.id.bt1);
        bt3 = (ImageButton) findViewById(R.id.bt3);
        orangeButton = (ImageButton) findViewById(R.id.orangeButton);
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
    }

    public void onClick(View v){
        Toast.makeText(this, "Button 2 was clicked!!", Toast.LENGTH_LONG).show();
    }

}
