package com.example.metlin_nazarov_3isp9_7_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

public class MainWindow extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void btnEnter_click(View view) {

        Intent i = new Intent(MainWindow.this,RecordWindow.class);
        startActivity(i);

    }
}


