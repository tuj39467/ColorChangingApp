package edu.temple.colorchangingapp;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;


public class PaletteFragment extends Fragment {

    int fragmentId;
    String defaultColor;

    private static final String KEY_ID = "fragmentId";
    private static final String KEY_COLOR = "defaultColor";

    GridView grid;
    public PaletteFragment() {
        // Required empty public constructor
    }

    public static PaletteFragment newInstance(int fragmentId,String color){
        PaletteFragment pf = new PaletteFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_ID,fragmentId);
        bundle.putString(KEY_COLOR, color);
        pf.setArguments(bundle);
        return pf;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Bundle bundle;
        if((bundle = getArguments()) != null){
            fragmentId = bundle.getInt(KEY_ID);
            defaultColor = bundle.getString(KEY_COLOR);
        }
        else{
            fragmentId = -1;
            defaultColor ="White";
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // grid = inflater.inflate(R.layout.fragment_palette, container, false);
        //container_1 = findViewById(R.id.container_1);
        //assert grid != null;
        grid = grid.findViewById(R.id.gridview);

        //final String[] colors = {"Red", "Yellow", "Green", "Blue", "Cyan", "Black", "Magenta","Gray","Light gray","Dark gray","White","Aqua"};
        Resources res = getResources();
        String[] colorList = res.getStringArray(R.array.Colors);

        final BaseAdapter ColorAdapter = new ColorAdapter(PaletteFragment.this, colorList);

        //TextView text = new TextView(MainActivity);
        //text.setText(R.string.instruction);
       // myLayout.addView(text);





        grid.setAdapter(ColorAdapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }

        });

        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_palette, container, false);
        return grid;

    }
}