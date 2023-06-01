package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    private TextView tv;
    private Button btn_move8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        tv = findViewById(R.id.tv);

        Intent intent = getIntent();
        int growth = intent.getIntExtra("result",0);
        String growth1 = intent.getStringExtra("result1");

        System.out.println("-> "+growth+growth1);

        tv.setText(String.valueOf(growth));
        tv.setText(growth1);

        btn_move8 = findViewById(R.id.btn_move8);
        btn_move8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity8.this , MainActivity9.class);
                startActivity(intent);
            }
        });





    }
}