package com.example.a1homework183;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ColorInfoListAdapter extends BaseAdapter {
//the adapter that was shown in class implemented to my phone code
    Context context;
    ArrayList<ColorInfo> arrayOfColors;
    public ColorInfoListAdapter(Context c, ArrayList<ColorInfo> ls)
    {
        context = c;
        arrayOfColors = ls;
    }

    @Override
    public int getCount() {
        return arrayOfColors.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayOfColors.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
        {
            LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            view = mInflater.inflate(R.layout.custom_cell, null);
        }

        ConstraintLayout li = view.findViewById(R.id.customCell);

        TextView red = view.findViewById(R.id.tv_v_cus_red);
        TextView green = view.findViewById(R.id.tv_v_cus_green);
        TextView blue = view.findViewById(R.id.tv_v_cus_blue);
        TextView hexadecimal = view.findViewById(R.id.tv_v_cus_hexa);

        ColorInfo colorInfo = arrayOfColors.get(i);

        red.setText(colorInfo.getRed()+"");
        green.setText(colorInfo.getGreen()+"");
        blue.setText(colorInfo.getBlue()+"");
        hexadecimal.setText(colorInfo.getHexaDecimal()+"");

        li.setBackgroundColor(Color.rgb(Integer.parseInt(red.getText()+""),Integer.parseInt(green.getText()+""),Integer.parseInt(blue.getText()+"")));
//making it a string for parse then goes to int from starting textview

        return view;
    }
}
