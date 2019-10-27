package com.example.recycling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Should_Recycle_Foam extends AppCompatActivity {
    private Button foam1, foam2;
    private TextView foamView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_should__recycle__foam);

        foam1 = (Button) findViewById(R.id.foam1);
        foam2 = (Button) findViewById(R.id.foam2);
        foamView = (TextView) findViewById(R.id.foamView);
        foam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foam1.setVisibility(View.INVISIBLE);
                foam2.setVisibility(View.INVISIBLE);
                foamView.setText("Throw the food scraps in home composting bins, then rinse and recycle it.");

            }
        });
        foam2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                foam1.setVisibility(View.INVISIBLE);
                foam2.setVisibility(View.INVISIBLE);
                foamView.setText("Just rinse it and then it can head out to Mr.Bin.");

            }
        });
    }
}
