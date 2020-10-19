package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements PaletteFragment.selectInterface{

    //PaletteFragment fragment;
    CanvasFragment cf = new CanvasFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        String[] colorList = res.getStringArray(R.array.Colors);

        PaletteFragment pf = new PaletteFragment();
        Bundle b = new Bundle();
        b.putStringArray(PaletteFragment.dataKey,getResources().getStringArray(R.array.Colors));
        pf.setArguments(b);

        PaletteFragment fragment = PaletteFragment.newInstance(colorList);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_1,fragment)
                .add(R.id.container_2,cf)
                .commit();
    }

    public void displayColorInfo(int color){
        cf.setColorToShow(color);
    }
}




