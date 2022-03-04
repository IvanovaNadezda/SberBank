package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed, ed2, ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {

        ed = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        ed3 = findViewById(R.id.editText3);

        int sum = Integer.parseInt(ed.getText().toString());
        int years = Integer.parseInt(ed2.getText().toString());
        int percent = Integer.parseInt(ed3.getText().toString());

        int result = sum * (1 + (years * percent)/100);

        Intent intent = new Intent(this, InfoActivity.class);
        intent.putExtra("ccc", result);
        startActivity(intent);
    }
}