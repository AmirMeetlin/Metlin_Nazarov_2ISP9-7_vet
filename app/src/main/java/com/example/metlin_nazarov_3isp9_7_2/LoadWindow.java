package com.example.metlin_nazarov_3isp9_7_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;


public class LoadWindow extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        imageView1 = findViewById(R.id.pawImg1);
        imageView2 = findViewById(R.id.pawImg2);
        imageView3 = findViewById(R.id.pawImg3);
        imageView4 = findViewById(R.id.pawImg4);
        Animation animationpaw1 = AnimationUtils.loadAnimation(this,R.anim.paw1);
        Animation animationpaw2 = AnimationUtils.loadAnimation(this,R.anim.paw2);
        Animation animationpaw3 = AnimationUtils.loadAnimation(this,R.anim.paw3);
        Animation animationpaw4 = AnimationUtils.loadAnimation(this,R.anim.paw4);
        imageView1.startAnimation(animationpaw1);
        imageView2.startAnimation(animationpaw2);
        imageView3.startAnimation(animationpaw3);
        imageView4.startAnimation(animationpaw4);

        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(8);
                    Intent i = new Intent(LoadWindow.this,MainWindow.class);
                    startActivity(i);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }; thread.start();



    }
}