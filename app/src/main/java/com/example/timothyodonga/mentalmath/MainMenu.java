package com.example.timothyodonga.mentalmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import static com.example.timothyodonga.mentalmath.R.id.multiplication_button;
import static com.example.timothyodonga.mentalmath.R.id.squaring_button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button moveBackToMainButton = (Button) findViewById(R.id.back_to_main_button);
        moveBackToMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveBackToMainIntent = new Intent(MainMenu.this,MainActivity.class);
                startActivity(moveBackToMainIntent);
            }
        }
        );


        Button moveToDivideButton = (Button) findViewById(R.id.divide_by_five_button);
        moveToDivideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToDivideIntent = new Intent(MainMenu.this,DivideMenu.class);
                startActivity(moveToDivideIntent);
            }
        }
        );

        Button moveToMultiplyButton = (Button) findViewById(multiplication_button);
        moveToMultiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToMultiplyIntent = new Intent(MainMenu.this,MultiplyMenu.class);
                startActivity(moveToMultiplyIntent);
            }
        }
        );

        Button moveToSquaringButton = (Button) findViewById(squaring_button);
        moveToSquaringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToSquaringIntent = new Intent(MainMenu.this,SquaringMenu.class);
                    startActivity(moveToSquaringIntent);
            }
        }
        );

    }
}
