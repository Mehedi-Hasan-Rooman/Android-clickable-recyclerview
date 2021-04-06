package com.example.recyclerview_parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        Example_Item exampleItem = intent.getParcelableExtra("Example Item");

        int imageRes = exampleItem.getmImageResource();
        String line1 = exampleItem.getmText1();
        String line2 = exampleItem.getmText2();

        ImageView imageView = findViewById(R.id.image_activity2);
        imageView.setImageResource(imageRes);
        TextView textView1 = findViewById(R.id.text1_activity2);
        textView1.setText(line1);
        TextView textView2 = findViewById(R.id.text2_activity2);
        textView2.setText(line2);
    }
}
