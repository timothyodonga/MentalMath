package com.example.timothyodonga.mentalmath;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.os.Build.VERSION_CODES.N;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button moveToMainMenuButton = (Button) findViewById(R.id.main_continue_button);
        moveToMainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToMainMenuIntent = new Intent(MainActivity.this,MainMenu.class);
                startActivity(moveToMainMenuIntent);
            }
        }
        );
    }
}
