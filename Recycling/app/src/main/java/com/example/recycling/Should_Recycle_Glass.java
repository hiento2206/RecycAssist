package com.example.recycling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Should_Recycle_Glass extends AppCompatActivity {
    private Button glass1, glass2;
    private TextView glassView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_should__recycle__glass);

        glass1 = (Button) findViewById(R.id.glass1);
        glass2 = (Button) findViewById(R.id.glass2);
        glassView = (TextView) findViewById(R.id.glassView);
        glass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glass1.setVisibility(View.INVISIBLE);
                glass2.setVisibility(View.INVISIBLE);
                glassView.setText("Aight, imma head out (to the trashbag). FYI: Glasswares are made thicker, and contains other chemicals.");

            }
        });
        glass2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                glass1.setVisibility(View.INVISIBLE);
                glass2.setVisibility(View.INVISIBLE);
                glassView.setText("Please lead me to the Recycle Bin.");

            }
        });
    }
}
