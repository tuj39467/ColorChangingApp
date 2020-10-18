package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements PaletteFragment.selectInterface {

    PaletteFragment[] fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PaletteFragment.newInstance(0,"Red");
        //CanvasFragment.newInstance(0,"Red");


        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_1,new PaletteFragment())
                .add(R.id.container_2,new CanvasFragment())
                .commit();
    }

    public void displayColorInfo(String color){

    }

    /*public void onAttachFragment(Fragment fragment){
        if(fragment instanceof PaletteFragment){
            PaletteFragment pf = (PaletteFragment)fragment;
            pf.setOnColorSelectedListener(this);
        }
    }*/

}




