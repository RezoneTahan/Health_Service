package com.example.healthservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FrameLayout extends AppCompatActivity implements View.OnClickListener {
    private TextView text1,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        text1 =(TextView) findViewById(R.id.text1);
        text2=(TextView) findViewById(R.id.text2);

        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.text1)
        {
            text1.setVisibility(View.GONE);
            text2.setVisibility(View.VISIBLE);
        }
        else if(view.getId()==R.id.text2)
        {
            text2.setVisibility(View.GONE);
            text1.setVisibility(View.VISIBLE);
        }

    }
}
