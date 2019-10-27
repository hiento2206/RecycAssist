package com.example.recycling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button, random_facts, buttonGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShouldRecycle();
            }
        });

        random_facts = (Button) findViewById(R.id.button3);
        random_facts.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openRandomFacts();
            }
        });

        buttonGame = (Button) findViewById(R.id.buttonGame);
        buttonGame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openGames();
            }
        });


    }

    public void openShouldRecycle(){
        Intent intent = new Intent(this, Should_Recycle.class);
        startActivity(intent);
    }
    public void openRandomFacts(){
        Intent intent = new Intent(this, Random_Facts.class);
        startActivity(intent);
    }
    public void openGames(){
        Intent intent = new Intent(this, Games.class);
        startActivity(intent);
    }

}
