package com.example.kimsoohyeong.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.kimsoohyeong.week2.R.id.b2;

public class Main4Activity extends AppCompatActivity {
    EditText e1, e2, e3;
    CheckBox c1;
    Button b1;
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    void init() {
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        e3 = (EditText)findViewById(R.id.e3);
        b1 = (Button)findViewById(R.id.b1);
        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean flag = c1.isChecked();
                String cnt1 = e1.getText().toString();
                String cnt2 = e2.getText().toString();
                String cnt3 = e3.getText().toString();
                int res = Integer.parseInt(cnt1) * 15000
                        + Integer.parseInt(cnt2) * 13000
                        + Integer.parseInt(cnt3) * 9000;

                res -= flag ? res / 10 : 0;

                t1.setText(Integer.toString(Integer.parseInt(cnt1) + Integer.parseInt(cnt2) + Integer.parseInt(cnt3)) + "개");
                t2.setText(Integer.toString(res) + "원");
            }
        });
    }
}
