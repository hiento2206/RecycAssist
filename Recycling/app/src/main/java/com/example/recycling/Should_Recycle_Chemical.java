package com.example.recycling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Should_Recycle_Chemical extends AppCompatActivity {
    private Button chemical1, chemical2, chemical3;
    private TextView chemView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_should__recycle__chemical);

        chemical1 = (Button) findViewById(R.id.chemical1);
        chemical2 = (Button) findViewById(R.id.chemical2);
        chemical3 = (Button) findViewById(R.id.chemical3);
        chemView = (TextView) findViewById(R.id.chemicalView);
        chemical1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chemical1.setVisibility(View.INVISIBLE);
                chemical2.setVisibility(View.INVISIBLE);
                chemical3.setVisibility(View.INVISIBLE);
                chemView.setText("If it's liquid base, then wash down the drain with water. If it's solid base, throw it in the trash.");

            }
        });
        chemical2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chemical1.setVisibility(View.INVISIBLE);
                chemical2.setVisibility(View.INVISIBLE);
                chemical3.setVisibility(View.INVISIBLE);
                chemView.setText("Recycle the oil by taking it to a recycle deposit");

            }
        });

        chemical3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chemical1.setVisibility(View.INVISIBLE);
                chemical2.setVisibility(View.INVISIBLE);
                chemical3.setVisibility(View.INVISIBLE);
                chemView.setText("Take it to the nearest Hazardous Chemical Processing Unit");

            }
        });
    }

}
