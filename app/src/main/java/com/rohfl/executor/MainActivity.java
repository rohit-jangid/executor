package com.rohfl.executor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


import com.rohfl.executor.interfaces.FetchHelloWorld;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity{

    Button button;

    @Inject
    FetchHelloWorld fetchHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            fetchHelloWorld.fetchHelloWorld(() -> {
                Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
            });
        });

    }
}