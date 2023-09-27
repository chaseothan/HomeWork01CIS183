package com.example.a1homework183;

import android.widget.TextView;

public class ColorInfo
{
    //instant variables
    private int red;

    private int green;

    private int blue;
    private String hexaDecimal;




    //getters and setters
    public int getRed() {return red;}

    public void setRed(int red)
    {
        this.red = red;
    }

    public int getGreen()
    {
        return green;
    }

    public void setGreen(int green)
    {
        this.green = green;
    }

    public int getBlue()
    {
        return blue;
    }

    public void setBlue(int blue)
    {
        this.blue = blue;
    }

    public ColorInfo()
    {

    }


    public ColorInfo(int r,int g, int b)
    {

        red = r;
        green = g;
        blue = b;

    }

    public void setHexaDecimal(String hexaDecimal) {
        this.hexaDecimal = hexaDecimal;
    }

    public String getHexaDecimal() {
        return hexaDecimal;
    }





}
