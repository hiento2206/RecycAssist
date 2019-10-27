package com.example.recycling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Should_Recycle_Metal extends AppCompatActivity {
    private Button metal1,metal2,metal3;
    private TextView metalView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_should__recycle__metal);

        metal1 = (Button) findViewById(R.id.metal1);
        metal2 = (Button) findViewById(R.id.metal2);
        metal3 = (Button) findViewById(R.id.metal3);
        metalView = (TextView) findViewById(R.id.metalView);
        metal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metal1.setVisibility(View.INVISIBLE);
                metal2.setVisibility(View.INVISIBLE);
                metal3.setVisibility(View.INVISIBLE);
                metalView.setText("Take it to the e-waste recycling center.");

            }
        });
        metal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metal1.setVisibility(View.INVISIBLE);
                metal2.setVisibility(View.INVISIBLE);
                metal3.setVisibility(View.INVISIBLE);
                metalView.setText("Put it in a separate container, and locate to the nearest sharp object(needles) drop-off.");
            }
        });
        metal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metal1.setVisibility(View.INVISIBLE);
                metal2.setVisibility(View.INVISIBLE);
                metal3.setVisibility(View.INVISIBLE);
                metalView.setText("If it contained hazardous wastes, drop it right off at hazardous stations, else take it to the recycle bin.");

            }
        });
    }
}
