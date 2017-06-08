package com.example.timothyodonga.mentalmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MultiplyMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply_menu);

        Button backToMainMenuButton = (Button) findViewById(R.id.multiply_main_menu_back_button);
        backToMainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent multiplyBackToMainMenuIntent = new Intent(MultiplyMenu.this,MainMenu.class);
                startActivity(multiplyBackToMainMenuIntent);
            }
        }
        );


        Button moveToMultiplyTutorialButton = (Button) findViewById(R.id.multiply_tutorial_button);
        moveToMultiplyTutorialButton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent moveToMultiplyTutorialIntent = new Intent(MultiplyMenu.this,MultiplyTutorial.class);
                  startActivity(moveToMultiplyTutorialIntent);
              }
        }
        );


        Button moveToMultiplyPracticeButton = (Button) findViewById(R.id.multiply_practice_button);
        moveToMultiplyPracticeButton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent moveToMultiplyPracticeIntent = new Intent(MultiplyMenu.this,MultiplyPractice.class);
                  startActivity(moveToMultiplyPracticeIntent);
              }
        }
        );
























    }
}
