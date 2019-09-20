package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goTo1(View view){
        setContentView(R.layout.activity_main);
    }

    public void goTo2(View view){
        setContentView(R.layout.view2);
    }

    public void goTo3(View view){
        setContentView(R.layout.view3);
    }
}
