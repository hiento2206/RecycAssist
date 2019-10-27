package com.example.recycling;

import android.app.Activity;
import android.os.Bundle;

public class Games_Start extends Activity {
    Games_View gamesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games__start);
        gamesView = new Games_View(this);
        setContentView(gamesView);
    }
}
