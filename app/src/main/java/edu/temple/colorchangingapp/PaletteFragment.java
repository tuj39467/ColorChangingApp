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
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.TextView;


public class PaletteFragment extends Fragment {

    String [] defaultColors;
    public static final String dataKey = "bundle_data_key";

    static String[] colors = {"Red", "Yellow", "Green", "Blue", "Cyan", "Black", "Magenta","Gray","Light gray","Dark gray","White","Aqua"};;
    private static final String KEY_COLORS = "colors";
    selectInterface parentActivity;
    GridView grid;
    FrameLayout myLayout;

    public PaletteFragment() {

    }

    public static PaletteFragment newInstance(String[] colors) {
        PaletteFragment pf = new PaletteFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray(KEY_COLORS, colors);
        pf.setArguments(bundle);
        return pf;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle;
        if ((bundle = getArguments()) != null) {
            defaultColors = bundle.getStringArray(KEY_COLORS);
        } else {
            defaultColors = null;
        }

    }

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

        grid = (GridView) l.findViewById(R.id.gridview);

        Resources res = getResources();
        final String[] colorList = res.getStringArray(R.array.Colors);

        grid.setAdapter(new ColorAdapter(getActivity(),colorList));

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                parentActivity.displayColorInfo(position);
            }
        });

        return l;

    }

    public interface selectInterface{
        void displayColorInfo(int color);
    }
}