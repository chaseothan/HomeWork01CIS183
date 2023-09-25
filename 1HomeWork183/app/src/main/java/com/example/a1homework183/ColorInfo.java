package com.example.a1homework183;

public class ColorInfo
{

    public int getRed() {
        return red;
    }

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

    private int red;

    private int green;

    private int blue;

    public ColorInfo(int r,int g, int b)
    {

        red = r;
        green = g;
        blue = b;

    }
    public ColorInfo()

    {

    }

    public String getHexDecimal() {
        return hexDecimal;
    }

    private String hexDecimal;



}
