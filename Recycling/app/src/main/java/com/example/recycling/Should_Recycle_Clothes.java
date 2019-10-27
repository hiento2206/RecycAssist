package com.example.recycling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Should_Recycle_Clothes extends AppCompatActivity {
    private Button clothes1, clothes2;
    private TextView clothesView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_should__recycle__clothes);

        clothes1 = (Button) findViewById(R.id.clothes1);
        clothes2 = (Button) findViewById(R.id.clothes2);
        clothesView = (TextView) findViewById(R.id.clothesView);
        clothes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clothes1.setVisibility(View.INVISIBLE);
                clothes2.setVisibility(View.INVISIBLE);
                clothesView.setText("You should donate them to the less fortunate. They will appreciate it.");

            }
        });
        clothes2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                clothes1.setVisibility(View.INVISIBLE);
                clothes2.setVisibility(View.INVISIBLE);
                clothesView.setText("The trashcan, it belongs to.");

            }
        });
        }

    }

