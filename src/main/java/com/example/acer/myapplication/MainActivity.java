package com.example.acer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void berikutnya1 (View view){

        Intent intent;
        intent = new Intent(this, hot1.class);
        startActivity (intent);
    }
    public void berikutnya2 (View view){

        Intent intent = new Intent (this, hot2.class);
        startActivity (intent);
    }
    public void berikutnya3 (View view){

        Intent intent = new Intent (this, hot3.class);
        startActivity (intent);
    }
}
