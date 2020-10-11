package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class PaletteActivity extends AppCompatActivity {
    GridView grid;
    ConstraintLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle(R.string.label1);
        myLayout = findViewById(R.id.myLayout);
        grid = (GridView) findViewById(R.id.gridview);

        //final String[] colors = {"Red", "Yellow", "Green", "Blue", "Cyan", "Black", "Magenta","Gray","Light gray","Dark gray","White","Aqua"};

        Resources res = getResources();
        String[] colorList = res.getStringArray(R.array.Colors);

        final BaseAdapter ColorAdapter = new ColorAdapter(PaletteActivity.this, colorList);

        TextView text = new TextView(this);
        text.setText(R.string.instruction);
        myLayout.addView(text);

        grid.setAdapter(ColorAdapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent canvasActivityIntent = new Intent(PaletteActivity.this,CanvasActivity.class);
                canvasActivityIntent.putExtra("Color",position);
                startActivity(canvasActivityIntent);

            }
        });



    }

}




