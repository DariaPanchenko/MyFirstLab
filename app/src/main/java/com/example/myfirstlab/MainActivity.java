package com.example.myfirstlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public int max(int a, int b){
        if (a >= b) {
            return a;
        }
        else
            return b;
    }

    public int min(int a, int b){
        if(a <= b) {
            return a;
        }
        else
            return b;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity m = new MainActivity();
        m.max(4,7);
        m.min(-9,3);
    }
}
