package com.example.timothyodonga.mentalmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SquaringTutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squaring_tutorial);

        Button backToMainMenuButton = (Button) findViewById(R.id.squaring_tutorial_back_button);
        backToMainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToMainMenuIntent = new Intent(SquaringTutorial.this,SquaringMenu.class);
                startActivity(backToMainMenuIntent);
            }
        }
        );

    }
}
