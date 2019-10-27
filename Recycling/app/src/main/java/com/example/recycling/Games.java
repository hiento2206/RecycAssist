package com.example.recycling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import java.util.Timer;

public class Games extends Activity {
    private Button buttonGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        buttonGame = findViewById(R.id.buttonGame);
        buttonGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGames_Stats();
            }
        });
    }

    public void startGame(View view){
        Intent intent = new Intent(this,Games_Start.class);
        startActivity(intent);
        finish();
    }

    public void openGames_Stats(){
        Intent intent = new Intent(this, Games_Stats.class);
        startActivity(intent);
    }

}
