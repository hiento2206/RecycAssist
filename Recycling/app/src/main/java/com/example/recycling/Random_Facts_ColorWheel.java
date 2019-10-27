package com.example.recycling;
import android.graphics.Color;
import java.util.Random;

public class Random_Facts_ColorWheel {
    public String[] mColor={"#e84a5f","#008000","#008080","#0000FF"};
    public int getColor(){
        Random rm=new Random();
        int rn=rm.nextInt(mColor.length);
        String color=mColor[rn];
        int colorAsInt= Color.parseColor(color);
        return colorAsInt;
    }
}
