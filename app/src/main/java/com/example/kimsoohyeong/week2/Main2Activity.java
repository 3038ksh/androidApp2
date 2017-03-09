package com.example.kimsoohyeong.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();
    }

    void init() {
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String year = e1.getText().toString();
                int res1 = 2017 - Integer.parseInt(year) + 1;

                Toast.makeText(getApplicationContext(),
                        "당신의 나이는 " + res1 + "입니다",
                        Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = e2.getText().toString();
                int res2 = 2017 - Integer.parseInt(age) + 1;

                Toast.makeText(getApplicationContext(),
                        "당신의 태어난 해는 " + res2 + "년 입니다",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
