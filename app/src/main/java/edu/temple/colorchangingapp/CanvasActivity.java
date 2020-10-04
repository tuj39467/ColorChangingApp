package edu.temple.colorchangingapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CanvasActivity extends AppCompatActivity {
    ConstraintLayout myLayout;
    //TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayout = findViewById(R.id.myLayout);
        //text = findViewById(R.id.textView);
        Intent result = getIntent();
        // String color = "";
        int color = result.getIntExtra("Color",0);

        if(color==(0)) {
            myLayout.setBackgroundColor(Color.RED);
            finish();
        }
        else if(color == 1) {
            myLayout.setBackgroundColor(Color.YELLOW);
            finish();
        }/*else if(color.equals("Green")) {
            myLayout.setBackgroundColor(Color.GREEN);
            finish();
        }else if(color.equals("Blue")) {
            myLayout.setBackgroundColor(Color.BLUE);
            finish();
        }else if(color.equals("Cyan")) {
            myLayout.setBackgroundColor(Color.CYAN);
            finish();
        }else if(color.equals("Black")) {
            myLayout.setBackgroundColor(Color.BLACK);
            finish();
        }else if(color.equals("Magenta")) {
            myLayout.setBackgroundColor(Color.MAGENTA);
            finish();
        }else if(color.equals("Gray")) {
            myLayout.setBackgroundColor(Color.GRAY);
            finish();
        }else if(color.equals("Light gray")) {
            myLayout.setBackgroundColor(Color.LTGRAY);
            finish();
        }else if(color.equals("Dark gray")) {
            myLayout.setBackgroundColor(Color.DKGRAY);
            finish();
        }else if(color.equals("Aqua")) {
            myLayout.setBackgroundColor(Color.CYAN);
            finish();
        }else if(color.equals("White")) {
            myLayout.setBackgroundColor(Color.TRANSPARENT);
            finish();
        }*/
    }
}
