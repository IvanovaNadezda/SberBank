package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            int result = bundle.getInt("ccc");
            textView.setText(String.valueOf(result));
        }

        setContentView(textView);
    }
}