package com.example.healthservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.healthservice.R.id.button1Id;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button3 = findViewById(R.id.button3Id);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,AbsoluteLayout.class);
                startActivity(intent);
            }
        });
        button2 = (Button) findViewById(R.id.button2Id);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FrameLayout.class);
                startActivity(intent);
            }
        });

        button1 = (Button) findViewById(button1Id);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivity.this,TableLayout.class);
                startActivity(intent);
            }
        });

    }
}
