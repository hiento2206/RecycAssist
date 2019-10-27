package com.example.recycling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Should_Recycle extends AppCompatActivity {
    private Button buttonPlastic, buttonGlass, buttonPaper, buttonFoam, buttonMetal, buttonClothe, buttonToys, buttonChemical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_should__recycle);

        //Buttons initializer
        buttonPlastic = findViewById(R.id.buttonPlastic);
        buttonPlastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecyclePlastic();
            }
        });

        buttonGlass = findViewById(R.id.buttonGlass);
        buttonGlass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecycleGlass();
            }
        });

        buttonPaper = findViewById(R.id.buttonPaper);
        buttonPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecyclePaper();
            }
        });

        buttonFoam = findViewById(R.id.buttonFoam);
        buttonFoam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecycleFoam();
            }
        });

        buttonMetal = findViewById(R.id.buttonMetal);
        buttonMetal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecycleMetal();
            }
        });

        buttonClothe = findViewById(R.id.buttonClothe);
        buttonClothe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecycleClothe();
            }
        });

        buttonToys = findViewById(R.id.buttonNatural);
        buttonToys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecycleNatural();
            }
        });

        buttonChemical = findViewById(R.id.buttonChemical);
        buttonChemical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecycleChemical();
            }
        });
        }

    //Buttons actions
    public void openRecyclePlastic() {
        Intent intent = new Intent(this, Should_Recycle_Plastic.class);
        startActivity(intent);
    }
    public void openRecycleGlass() {
        Intent intent = new Intent(this, Should_Recycle_Glass.class);
        startActivity(intent);
    }
    public void openRecyclePaper() {
        Intent intent = new Intent(this, Should_Recycle_Paper.class);
        startActivity(intent);
    }
    public void openRecycleFoam() {
        Intent intent = new Intent(this, Should_Recycle_Foam.class);
        startActivity(intent);
    }
    public void openRecycleMetal() {
        Intent intent = new Intent(this, Should_Recycle_Metal.class);
        startActivity(intent);
    }
    public void openRecycleClothe() {
        Intent intent = new Intent(this, Should_Recycle_Clothes.class);
        startActivity(intent);
    }
    public void openRecycleNatural() {
        Intent intent = new Intent(this, Should_Recycle_Natural.class);
        startActivity(intent);
    }
    public void openRecycleChemical() {
        Intent intent = new Intent(this, Should_Recycle_Chemical.class);
        startActivity(intent);
    }
}
