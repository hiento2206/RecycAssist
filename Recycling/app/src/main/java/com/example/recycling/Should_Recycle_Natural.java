package com.example.recycling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Should_Recycle_Natural extends AppCompatActivity {
    private Button natural1, natural2, natural3;
    private TextView naturalView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_should__recycle__natural);

        natural1 = (Button) findViewById(R.id.natural1);
        natural2 = (Button) findViewById(R.id.natural2);
        natural3 = (Button) findViewById(R.id.natural3);
        naturalView = (TextView) findViewById(R.id.naturalView);
        natural1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                natural1.setVisibility(View.INVISIBLE);
                natural2.setVisibility(View.INVISIBLE);
                natural3.setVisibility(View.INVISIBLE);
                naturalView.setText("The Recycling Bin will like these leftovers.");

            }
        });
        natural2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                natural1.setVisibility(View.INVISIBLE);
                natural2.setVisibility(View.INVISIBLE);
                natural3.setVisibility(View.INVISIBLE);
                naturalView.setText("The Recycling Bin will not like this 'food', to the trashcan!");

            }
        });
        natural3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                natural1.setVisibility(View.INVISIBLE);
                natural2.setVisibility(View.INVISIBLE);
                natural3.setVisibility(View.INVISIBLE);
                naturalView.setText("Leaves? Grass? Nature helps nature, in the recycling bin.");

            }
        });
    }
}
