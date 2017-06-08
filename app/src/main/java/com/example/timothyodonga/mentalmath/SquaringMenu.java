package com.example.timothyodonga.mentalmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SquaringMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squaring_menu);

        Button backToMainMenuButton = (Button) findViewById(R.id.squaring_main_menu_back_button);
        backToMainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToMainMenuIntent = new Intent(SquaringMenu.this,MainMenu.class);
                startActivity(backToMainMenuIntent);
            }
        }
        );


        Button moveToSquaringTutorialButton = (Button) findViewById(R.id.squaring_tutorial_button);
        moveToSquaringTutorialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToSquaringTutorialIntent = new Intent(SquaringMenu.this,SquaringTutorial.class);
                startActivity(moveToSquaringTutorialIntent);
            }
        }
        );


        Button moveToSquaringPracticeButton = (Button) findViewById(R.id.squaring_practice_button);
        moveToSquaringPracticeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToSquaringPracticeIntent = new Intent(SquaringMenu.this,SquaringPractice.class);
                startActivity(moveToSquaringPracticeIntent);
            }
        }
        );



    }
}
