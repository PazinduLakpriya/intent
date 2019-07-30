package com.example.student.intent_p;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText num01;
    EditText num02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        num01 = findViewById(R.id.num1);
        num02 = findViewById(R.id.num2);

    }

    public void sendVal(View v) {

        Intent intent1 = new Intent(FirstActivity.this,SecondActivity.class);

        String n1 = num01.getText().toString();
        String n2 = num02.getText().toString();

        intent1.putExtra("firstDigit", n1);
        intent1.putExtra("secondDigit",n2);

        startActivity(intent1);

    }





}
