package com.example.timothyodonga.mentalmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DivideMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide_menu);

        Button backToMainMenuButton = (Button) findViewById(R.id.divide_main_menu_back_button);
        backToMainMenuButton.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        Intent divideBackToMainMenuIntent = new Intent(DivideMenu.this,MainMenu.class);
                                                        startActivity(divideBackToMainMenuIntent);
                                                    }
                                                }
        );


        Button moveToDivideTutorialButton = (Button) findViewById(R.id.divide_tutorial_button);
        moveToDivideTutorialButton.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        Intent moveToDivideTutorialIntent = new Intent(DivideMenu.this,DivideTutorial.class);
                                                        startActivity(moveToDivideTutorialIntent);
                                                    }
                                                }
        );


        Button moveToDividePracticeButton = (Button) findViewById(R.id.divide_practice_button);
        moveToDividePracticeButton.setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View v) {
                                                              Intent moveToDividePracticeIntent = new Intent(DivideMenu.this,DividePractice.class);
                                                              startActivity(moveToDividePracticeIntent);
                                                          }
                                                      }
        );

















    }
}
