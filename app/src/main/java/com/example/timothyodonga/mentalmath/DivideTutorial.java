package com.example.timothyodonga.mentalmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.os.Build.VERSION_CODES.M;

public class DivideTutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide_tutorial);

        Button moveBackToDivideMenuButton = (Button) findViewById(R.id.divide_tutorial_back_button);
        moveBackToDivideMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveBackToDivideMenu = new Intent(DivideTutorial.this,DivideMenu.class);
                startActivity(moveBackToDivideMenu);
            }
        }
        );
    }
}
