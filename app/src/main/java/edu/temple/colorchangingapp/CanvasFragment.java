package edu.temple.colorchangingapp;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

public class CanvasFragment extends Fragment {

    FrameLayout myLayout;
    TextView colorText;
    public static final String dataKey = "bundle_data_key";

    public CanvasFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View v = inflater.inflate(R.layout.fragment_canvas, container, false);
       myLayout = v.findViewById(R.id.canvasLayout);
       colorText = v.findViewById(R.id.canvasText);

       return v;
    }

    public void setColorToShow(int color){
        //assert color != null;
        Resources res = getResources();
        String[] colorList = res.getStringArray(R.array.Colors);

        if(color == 0){
            myLayout.setBackgroundColor(Color.RED);
            colorText.setText(R.string.Green);
            myLayout.addView(colorText);
        }
        else if(color == 1){
            myLayout.setBackgroundColor(Color.YELLOW);
            colorText.setText(R.string.Yellow);
            myLayout.addView(colorText);
        }
        else if(color == 2){
            myLayout.setBackgroundColor(Color.GREEN);
            colorText.setText(R.string.Green);
            myLayout.addView(colorText);
        }
        else if(color == 3){
            myLayout.setBackgroundColor(Color.BLUE);
            colorText.setText(R.string.Blue);
            myLayout.addView(colorText);
        }
        else if(color == 4){
            myLayout.setBackgroundColor(Color.CYAN);
            colorText.setText(R.string.Cyan);
            myLayout.addView(colorText);
        }
        else if(color == 5){
            myLayout.setBackgroundColor(Color.BLACK);
            colorText.setText(R.string.Black);
            myLayout.addView(colorText);
        }
        else if(color == 6){
            myLayout.setBackgroundColor(Color.MAGENTA);
            colorText.setText(R.string.Magenta);
            myLayout.addView(colorText);
        }
        else if(color == 7){
            myLayout.setBackgroundColor(Color.GRAY);
            colorText.setText(R.string.Gray);
            myLayout.addView(colorText);
        }else if(color == 8){
            myLayout.setBackgroundColor(Color.LTGRAY);
            colorText.setText(R.string.LightGray);
            myLayout.addView(colorText);
        }else if(color == 9){
            myLayout.setBackgroundColor(Color.DKGRAY);
            colorText.setText(R.string.DarkGrey);
            myLayout.addView(colorText);
        }else if(color == 10){
            myLayout.setBackgroundColor(Color.WHITE);
            colorText.setText(R.string.White);
            myLayout.addView(colorText);
        }else if(color == 11){
            myLayout.setBackgroundColor(Color.CYAN);
            colorText.setText(R.string.Aqua);
            myLayout.addView(colorText);
        }
    }

}