package com.example.recycling;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Games_View extends View {

    Handler handler;
    Runnable runnable;
    final int UPDATE_MILLIS = 30;
    Bitmap background;
    Bitmap topTube, botTube;
    Display display;
    Point point;
    int width, height;
    Rect rect;
    Bitmap[] plane;
    int planeF, speed = 0, grav = 3, planeX , planeY;
    boolean gameStarted = false, gameOver = false;
    int gap = 400, minTubeOffSet, maxTubeOffSet, numTubes = 4, disTubes, tubeSpeed = 8;
    int[] tubeX = new int[numTubes];
    int[] tubeY = new int[numTubes];
    Random rand;
    Rect boundsTop, boundsBot;

    public Games_View(Context context){
        super(context);
        handler = new Handler();
        runnable = new Runnable(){
            public void run(){
                invalidate();
            }
        };
        background = BitmapFactory.decodeResource(getResources(),R.drawable.backgound);
        topTube= BitmapFactory.decodeResource(getResources(),R.drawable.tubeabove);
        botTube = BitmapFactory.decodeResource(getResources(),R.drawable.tubedown);
        display = ((Activity)getContext()).getWindowManager().getDefaultDisplay();
        point = new Point();
        display.getSize(point);
        width = point.x;
        height = point.y;
        rect = new Rect(0,0,width,height);
        plane = new Bitmap[2];
        plane[0] = BitmapFactory.decodeResource(getResources(),R.drawable.plane);
        plane[1] = BitmapFactory.decodeResource(getResources(),R.drawable.plane);
        planeX = width/2-plane[0].getWidth()/2;
        planeY = height/2-plane[0].getHeight()/2;
        disTubes = width*3/4;
        minTubeOffSet = gap/2;
        maxTubeOffSet = height - minTubeOffSet - gap;
        rand = new Random();
        for(int i = 0; i < numTubes; i++) {
            tubeX[i] = width + i*disTubes ;
            tubeY[i] = minTubeOffSet + rand.nextInt(maxTubeOffSet-minTubeOffSet + 1);
        }
        boundsTop = new Rect(tubeX[0], tubeY[0], topTube.getWidth(),topTube.getHeight());
        boundsBot = new Rect(tubeX[0], tubeY[0], botTube.getWidth(), botTube.getHeight());
    }
    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawBitmap(background, null, rect, null);
        if(planeF == 0){
            planeF = 1;
        }else{
            planeF = 0;
        }

    if(gameStarted) {
        if (planeY < height - plane[0].getHeight() || speed < 0) {
            speed += grav;
            planeY += speed;
        }
        for(int i = 0; i < numTubes; i++) {
            tubeX[i] -= tubeSpeed;
            if(tubeX[i] < -topTube.getWidth()){
                tubeX[i] += numTubes*disTubes;
                tubeY[i] = minTubeOffSet + rand.nextInt(maxTubeOffSet-minTubeOffSet + 1);
            }
            canvas.drawBitmap(topTube, tubeX[i], tubeY[i] - topTube.getHeight(), null);
            canvas.drawBitmap(botTube, tubeX[i], tubeY[i] + gap, null);

        }
    }
        canvas.drawBitmap(plane[planeF], planeX, planeY,null);
        handler.postDelayed(runnable,UPDATE_MILLIS);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if(action == MotionEvent.ACTION_DOWN){
            speed = -30;
            gameStarted = true;

        }
        return true;
    }

}
