package com.example.recycling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Random_Facts extends AppCompatActivity {
    private Button buttonRand;
    private TextView textRand;
    private RelativeLayout relaRand;
    private Random_Facts_Book randomFactBook= new Random_Facts_Book();
    private Random_Facts_ColorWheel cColorWheel = new Random_Facts_ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random__facts);

        buttonRand = (Button) findViewById(R.id.buttonRand);
        textRand = (TextView) findViewById(R.id.textRand);
        relaRand = (RelativeLayout) findViewById(R.id.activity_random_facts);

        buttonRand.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String fact = randomFactBook.getFact();
                textRand.setText(fact);

                int color = cColorWheel.getColor();
                relaRand.setBackgroundColor(color);
                buttonRand.setTextColor(color);

            }
        });

    }


}
