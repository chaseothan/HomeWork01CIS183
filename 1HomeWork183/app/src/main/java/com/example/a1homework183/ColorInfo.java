package com.example.a1homework183;

public class ColorInfo
{
    //instant variables
    private int red;

    private int green;

    private int blue;

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



    public ColorInfo(int r,int g, int b)
    {

        red = r;
        green = g;
        blue = b;

    }


    public String getHexaDecimal() {
        return hexaDecimal;
    }

    private String hexaDecimal;



}
