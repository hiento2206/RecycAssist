package com.example.recycling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Should_Recycle_Plastic extends AppCompatActivity {
    private Button plastic1,plastic2,plastic3,plastic4;
    private TextView plasticView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_should__recycle__plastic);

        plastic1 = (Button) findViewById(R.id.plastic1);
        plastic2 = (Button) findViewById(R.id.plastic2);
        plastic3 = (Button) findViewById(R.id.plastic3);
        plastic4 = (Button) findViewById(R.id.plastic4);
        plasticView = (TextView) findViewById(R.id.plasticView);
        plastic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plastic1.setVisibility(View.INVISIBLE);
                plastic2.setVisibility(View.INVISIBLE);
                plastic3.setVisibility(View.INVISIBLE);
                plastic4.setVisibility(View.INVISIBLE);
                plasticView.setText("Try to reuse it, and only recycle if there is a recycling icon on the bag. Else, it's bad for recycling.");

            }
        });
        plastic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plastic1.setVisibility(View.INVISIBLE);
                plastic2.setVisibility(View.INVISIBLE);
                plastic3.setVisibility(View.INVISIBLE);
                plastic4.setVisibility(View.INVISIBLE);
                plasticView.setText("Water Bottles, always recycle them (empty it first though).");

            }
        });
        plastic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plastic1.setVisibility(View.INVISIBLE);
                plastic2.setVisibility(View.INVISIBLE);
                plastic3.setVisibility(View.INVISIBLE);
                plastic4.setVisibility(View.INVISIBLE);
                plasticView.setText("Wash the toys/utensils first, then it's all good for recycling");

            }
        });
        plastic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plastic1.setVisibility(View.INVISIBLE);
                plastic2.setVisibility(View.INVISIBLE);
                plastic3.setVisibility(View.INVISIBLE);
                plastic4.setVisibility(View.INVISIBLE);
                plasticView.setText("If the item has a plastic number of 1 to 7 inside of the recycle icon, then recycle it. Else, it belongs in the trashcan.");

            }
        });
    }


}
