package com.example.recycling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Should_Recycle_Paper extends AppCompatActivity {
    private TextView paperView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_should__recycle__paper);
        paperView = (TextView) findViewById(R.id.paperView);
        paperView.setText("The Recycling Bin is the One Direction and the Only Direction");
    }
}
