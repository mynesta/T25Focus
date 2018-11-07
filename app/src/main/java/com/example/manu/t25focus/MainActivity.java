package com.example.manu.t25focus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int suma (int a, int b){
        return a + b;
    }

    public int resta (int a, int b){
        return a-b;
    }
}
