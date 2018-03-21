package com.example.aluno.stateapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Robot Andre = new Robot(getApplicationContext());
        Andre.walk();
        Andre.walk();
        Andre.cook();
        Andre.cook();
        Andre.off();

    }

}
