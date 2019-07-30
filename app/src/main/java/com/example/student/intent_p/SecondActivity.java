package com.example.student.intent_p;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int n1;
    int n2;
    TextView tv;
    TextView tv2;
    String fNum;
    String sNum;
    EditText num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv = findViewById(R.id.txtAns);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        Intent intentSecActi = getIntent();

        fNum = intentSecActi.getStringExtra("firstDigit");
        sNum = intentSecActi.getStringExtra("secondDigit");

        num1.setText(fNum);
        num2.setText(sNum);

        n1 = Integer.parseInt(fNum);
        n2 = Integer.parseInt(sNum);


    }


    public void add(View view) {
        String message = n1+ " + "+n2+ " = "+(n1+n2);
        tv.setText(message);
    }

    public void sub(View view) {
        String message = n1+ " - "+n2+ " = "+(n1-n2);
        tv.setText(message);
    }

    public void multi(View view) {
        String message = n1+ " * "+n2+ " = "+(n1*n2);
        tv.setText(message);
    }

    public void div(View view) {
        String message = n1+ " / "+n2+ " = "+(n1/n2);
        tv.setText(message);
    }








}
