package edu.temple.colorchangingapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
        Context context;
        String[] colors;

        public ColorAdapter(Context context, String[] colors){
            this.context = context;
            this.colors = colors;
        }


        @Override
        public int getCount() {
            return colors.length;
        }

        @Override
        public Object getItem(int position) {
            return colors[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent){

            final int[] colored = {Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE, Color.CYAN, Color.BLACK, Color.MAGENTA, Color.GRAY, Color.LTGRAY, Color.DKGRAY,Color.TRANSPARENT,Color.CYAN};

            TextView textView = new TextView(context);
            textView.setId(position);
            textView.setText(colors[position]);
            textView.setTextSize(20);
            textView.setPadding(10,10,10,10);
            textView.setText(getItem(position).toString());
            textView.setBackgroundColor(colored[position % colored.length]);


            return textView;

        }
    }



