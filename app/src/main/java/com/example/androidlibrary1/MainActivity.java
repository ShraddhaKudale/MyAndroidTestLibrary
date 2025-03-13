package com.example.androidlibrary1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.toastexample.toaster;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toaster.simpleToast(this,"test library");
    }
}

