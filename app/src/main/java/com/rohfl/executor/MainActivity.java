package com.rohfl.executor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


import com.rohfl.executor.interfaces.FetchHelloWorld;
import com.rohfl.executor.interfaces.PresenterView;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity implements PresenterView.View {

    Button button;

    @Inject
    PresenterView.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        presenter.takeView(this);

        button.setOnClickListener(v -> {
            presenter.fetchHelloWorld();
        });

    }

    @Override
    public void showToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        presenter.dropView();
        super.onDestroy();
    }
}