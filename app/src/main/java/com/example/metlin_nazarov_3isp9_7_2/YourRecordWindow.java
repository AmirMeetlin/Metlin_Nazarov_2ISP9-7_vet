package com.example.metlin_nazarov_3isp9_7_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class YourRecordWindow extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yourrecord);

            TextView textView1=findViewById(R.id.textName);
            TextView textView2=findViewById(R.id.textAnimal);
            TextView textView3=findViewById(R.id.textDate);

            Bundle arguments= getIntent().getExtras();
            String name=arguments.get("name").toString();
            String animal=arguments.get("animal").toString();
            String date=arguments.get("date").toString();
            textView1.setText(name);
            textView2.setText(animal);
            textView3.setText(date);
    }

    public void btnExit2_click(View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
