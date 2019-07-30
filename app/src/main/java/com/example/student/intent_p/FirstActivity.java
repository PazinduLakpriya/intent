package com.example.student.intent_p;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    public static final String number1 = "1";
    public static final String number2 = "2";

    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

    }

    public void onClick(View view) {

      //  Intent intent1 = new Intent(FirstActivity.this,SecondActivity.class);

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(number1,n1);
        intent.putExtra(number2,n2);

        startActivity(intent);

    }





}
