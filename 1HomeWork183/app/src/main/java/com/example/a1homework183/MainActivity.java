package com.example.a1homework183;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    SeekBar sb_j_seekRed;
    SeekBar sb_j_seekGreen;
    SeekBar sb_j_seekBlue;
    TextView tv_j_redValue;
    TextView tv_j_greenValue;
    TextView tv_j_blueValue;
    Button btn_j_addColor;
    int red;
    int green;
    int blue;


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
    btn_j_addColor = findViewById(R.id.btn_v_addColor);

    //Event for seek bar red I forgot what this thing is called i think its called calling it
    seekBarEventRed();
    seekBarEventGreen();
    seekBarEventBlue();

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
        //set background red to global var red


    }


}