package edu.temple.colorchangingapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {
    ConstraintLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = new TextView(this);
        text.setGravity(4);

        myLayout = findViewById(R.id.myLayout);

        Intent result = getIntent();

        int color = result.getIntExtra("Color",0);

        if(color == 0) {
            myLayout.setBackgroundColor(Color.RED);
            text.setText(R.string.Red);
            myLayout.addView(text);
        }
        else if(color == 1) {
            myLayout.setBackgroundColor(Color.YELLOW);
            text.setText(R.string.Yellow);
            myLayout.addView(text);
        }else if(color == 2) {
            myLayout.setBackgroundColor(Color.GREEN);
            text.setText(R.string.Green);
            myLayout.addView(text);

        }else if(color == 3) {
            myLayout.setBackgroundColor(Color.BLUE);
            text.setText(R.string.Blue);
            myLayout.addView(text);

        }else if(color == 4) {
            myLayout.setBackgroundColor(Color.CYAN);
            text.setText(R.string.Cyan);
            myLayout.addView(text);

        }else if(color == 5) {
            myLayout.setBackgroundColor(Color.BLACK);
            text.setText(R.string.Black);
            myLayout.addView(text);

        }else if(color == 6) {
            myLayout.setBackgroundColor(Color.MAGENTA);
            text.setText(R.string.Magenta);
            myLayout.addView(text);
        }else if(color == 7) {
            myLayout.setBackgroundColor(Color.GRAY);
            text.setText(R.string.Gray);
            myLayout.addView(text);

        }else if(color == 8) {
            myLayout.setBackgroundColor(Color.LTGRAY);
            text.setText(R.string.LightGray);
            myLayout.addView(text);

        }else if(color == 9) {
            myLayout.setBackgroundColor(Color.DKGRAY);
            text.setText(R.string.DarkGrey);
            myLayout.addView(text);

        }else if(color == 10) {
            myLayout.setBackgroundColor(Color.TRANSPARENT);
            text.setText(R.string.White);
            myLayout.addView(text);

        }else if(color == 11) {
            myLayout.setBackgroundColor(Color.CYAN);
            text.setText(R.string.Aqua);
            myLayout.addView(text);

        }

    }

}
