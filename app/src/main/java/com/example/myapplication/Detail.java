package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String fruitName = intent.getStringExtra("fruitName");
        String fruitImg = intent.getStringExtra("fruitImg");


        // ตัดสินใจว่าจะนำรูปใดมาแสดง ขึ้นกันค่า fruitImg ที่รับมา
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        switch (fruitImg){
            case "pi": imageView.setImageResource(R.drawable.pi); break;
            case "orange": imageView.setImageResource(R.drawable.orange); break;
            case "banana": imageView.setImageResource(R.drawable.banana); break;
            case "cherry": imageView.setImageResource(R.drawable.cherry); break;
            default: imageView.setImageResource(R.drawable.cherry);
        }

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(fruitName);
    }
}