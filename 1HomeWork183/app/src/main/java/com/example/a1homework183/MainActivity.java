package com.example.a1homework183;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

//chase miracle
//Homework_02
//september 30th
//RGB app to store colors 
public class MainActivity extends AppCompatActivity {

    SeekBar sb_j_seekRed;
    SeekBar sb_j_seekGreen;
    SeekBar sb_j_seekBlue;
    TextView tv_j_redValue;
    TextView tv_j_greenValue;
    TextView tv_j_blueValue;
    Button btn_j_addColor;
    TextView tv_j_hexadecimal;
    int red = 255;
    int green = 255;
    int blue = 255;
    ConstraintLayout li;
    String hexValueR = "ff";
    String hexValueG = "ff";
    String hexValueB = "ff";
    ArrayList<ColorInfo> arrayOfColors;
    ColorInfoListAdapter adapter;
    ListView lv_j_arrayOfColor;
    TextView tv_j_cusRed;
    TextView tv_j_cusBlue;
    TextView tv_j_cusGreen;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find all of them on gui

    sb_j_seekRed = findViewById(R.id.sb_v_redSeek);
    sb_j_seekGreen = findViewById(R.id.sb_v_greenSeek);
    sb_j_seekBlue = findViewById(R.id.sb_v_blueSeek);
    tv_j_redValue = findViewById(R.id.tv_v_redValue);
    tv_j_greenValue = findViewById(R.id.tv_v_greenValue);
    tv_j_blueValue = findViewById(R.id.tv_v_blueValue);
    tv_j_hexadecimal = findViewById(R.id.tv_v_hexidecimal);
    btn_j_addColor = findViewById(R.id.btn_v_addColor);
    lv_j_arrayOfColor = findViewById(R.id.lv_v_arrayOfColor);
    li = findViewById(R.id.Background);
    tv_j_cusRed = findViewById(R.id.tv_v_cus_red);
    tv_j_cusBlue = findViewById(R.id.tv_v_cus_blue);
    tv_j_cusGreen = findViewById(R.id.tv_v_cus_green);

    arrayOfColors = new ArrayList<ColorInfo>();





    //Event for seek bar red I forgot what this thing is called i think its called calling it
    seekBarEventRed();
    seekBarEventGreen();
    seekBarEventBlue();

    registerButtonEventHandler();
    listViewEvent();

    }

    public void listViewEvent()
    {
        lv_j_arrayOfColor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {



                blue = Integer.parseInt(tv_j_cusBlue.toString());
                green = Integer.parseInt(tv_j_cusGreen.toString());
                red = Integer.parseInt(tv_j_cusRed.toString());

                changeBackgroundColor();


            }
        });
    }



    //the seek bar event for RED

    public void seekBarEventRed()
    {
        sb_j_seekRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b)
            {
                red = i;



                tv_j_redValue.setText("" + String.valueOf(i));
                //make the red value display the progress of the bar
                changeBackgroundColor();

                hexValueR = Integer.toHexString(red);


                makeHexadecimal();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    //the seek bar event for Green
    public void seekBarEventGreen()
    {
        sb_j_seekGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b)
            {

                green = i;



                tv_j_greenValue.setText("" + String.valueOf(i));

                changeBackgroundColor();

                hexValueG = Integer.toHexString(green);

                makeHexadecimal();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    //the seek bar event for blue
    public void seekBarEventBlue()
    {
        sb_j_seekBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b)
            {
                blue = i;

                tv_j_blueValue.setText("" + String.valueOf(i));

                changeBackgroundColor();



                hexValueB = Integer.toHexString(blue);

                makeHexadecimal();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }



    public void changeBackgroundColor()
    {
        //but i think convert it first to hex
        //set background red to global var red

        li.setBackgroundColor(Color.rgb(red,green,blue));

    }

    public void makeHexadecimal()
    {
        tv_j_hexadecimal.setText("" + String.valueOf(hexValueR)+"" + String.valueOf(hexValueG)+"" + String.valueOf(hexValueB));

    }

    public void registerButtonEventHandler()
    {
        btn_j_addColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addColor();
                resetGUI();
                displayListOfColors();
                adapter.notifyDataSetChanged();
            }
        });
    }

    public void addColor()
    {
        ColorInfo newColor = new ColorInfo();

        String red = tv_j_redValue.getText().toString();
        String green = tv_j_greenValue.getText().toString();
        String blue = tv_j_blueValue.getText().toString();
        String hexaDecimal =tv_j_hexadecimal.getText().toString();

        newColor.setRed(Integer.parseInt(red));
        newColor.setGreen(Integer.parseInt(green));
        newColor.setBlue(Integer.parseInt(blue));
        newColor.setHexaDecimal(hexaDecimal);

        arrayOfColors.add(newColor);

        fillListView();

    }

    public void resetGUI()
    {
        red = 255;
        green = 255;
        blue = 255;
        li.setBackgroundColor(Color.rgb(red,green,blue));
        sb_j_seekRed.setProgress(255);
        sb_j_seekGreen.setProgress(255);
        sb_j_seekBlue.setProgress(255);
    }
    public void displayListOfColors()
    {
        for (int i = 0; i < arrayOfColors.size(); i++)
        {

        }
    }
    public void fillListView()
    {
        adapter = new ColorInfoListAdapter(this, arrayOfColors);

        lv_j_arrayOfColor.setAdapter(adapter);
    }
}