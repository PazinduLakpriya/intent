package com.example.student.intent_p;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private int n1,n2,ans;
    private TextView display;
    private String input1,input2,displayAns;
    private EditText num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        display = findViewById(R.id.txtAns);



        Intent intentSecActi = getIntent();

        input1 = intentSecActi.getStringExtra(FirstActivity.number1);
        input2 = intentSecActi.getStringExtra(FirstActivity.number2);

        num1.setText(input1);
        num2.setText(input2);

        n1 = Integer.parseInt(input1);
        n2 = Integer.parseInt(input2);


    }


    public void addNumbers(View view) {
        ans = n1 + n2;
        displayAns = input1+ " + "+input2+ " = "+ans;
        displayAnswer(displayAns);
    }

    public void substracyNumbers(View view) {
        ans = n1 - n2;
        String message = input1+ " - "+input2+ " = "+ans;
        displayAnswer(displayAns);
    }


    public void multiplyNumbers(View view) {
        ans = n1 * n2;
        String message = input1+ " * "+input2+ " = "+ans;
        displayAnswer(displayAns);
    }

    public void dividNumbers(View view) {
        ans = n1 / n2;
        String message = input1+ " / "+input2+ " = "+ans;
        displayAnswer(displayAns);
    }

    public void displayAnswer(String displayAns) {
       display.setText(displayAns);
    }






}
