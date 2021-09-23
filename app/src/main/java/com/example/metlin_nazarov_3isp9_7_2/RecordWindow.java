package com.example.metlin_nazarov_3isp9_7_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RecordWindow extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
    }

    public void btnRecord_click(View view) {

        EditText editText1 = findViewById(R.id.tbName);
        EditText editText2 = findViewById(R.id.tbAnimal);
        EditText editText3 = findViewById(R.id.tbDate);
        String name = editText1.getText().toString();
        String animal = editText2.getText().toString();
        String date = editText3.getText().toString();

        Intent i = new Intent(RecordWindow.this,YourRecordWindow.class);
        i.putExtra("name",name);
        i.putExtra("animal",animal);
        i.putExtra("date",date);
        startActivity(i);
    }

    public void btnExit_click(View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
