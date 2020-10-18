package edu.temple.colorchangingapp;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.NonNull;
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
    public static final String dataKey = "bundle_data_key";

    private static final String KEY_ID = "fragmentId";
    private static final String KEY_COLOR = "defaultColor";
    private selectInterface parentActivity;
    GridView grid;

    public PaletteFragment() {

    }

    public static PaletteFragment newInstance(int fragmentId, String color) {
        PaletteFragment pf = new PaletteFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_ID, fragmentId);
        bundle.putString(KEY_COLOR, color);
        pf.setArguments(bundle);
        return pf;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle;
        if ((bundle = getArguments()) != null) {
            fragmentId = bundle.getInt(KEY_ID);
            defaultColor = bundle.getString(KEY_COLOR);
        } else {
            fragmentId = -1;
            defaultColor = "White";
        }

    }

    /*
        public void setOnColorSelectedListener(selectInterface pf){
            this.pf = pf;
        }
    */
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof selectInterface) {
            parentActivity = (selectInterface) context;
        } else {
            throw new RuntimeException("You must implement selectInterface to attach this fragment");
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {


        View l = inflater.inflate(R.layout.fragment_palette, container, false);
        //final String[] colors = {"Red", "Yellow", "Green", "Blue", "Cyan", "Black", "Magenta","Gray","Light gray","Dark gray","White","Aqua"};
        grid = (GridView) l.findViewById(R.id.gridview);



        // final BaseAdapter ColorAdapter = new ColorAdapter(PaletteFragment.this, colorList);

        //TextView text = new TextView(MainActivity);
        //text.setText(R.string.instruction);
        // myLayout.addView(text);

        // grid.setAdapter(ColorAdapter);
        grid.setAdapter(new ColorAdapter(PaletteFragment.this, getArguments().getStringArray(dataKey)));

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                parentActivity.displayColorInfo(((TextView)view).getText().toString());

            }
        });

        return l;

    }
    public interface selectInterface{
        void displayColorInfo(String color);
    }
}