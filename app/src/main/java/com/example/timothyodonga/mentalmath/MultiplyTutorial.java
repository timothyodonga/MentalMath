package com.example.timothyodonga.mentalmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MultiplyTutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply_tutorial);

        Button backToMultiplyMenuButton = (Button) findViewById(R.id.multiply_tutorial_back_button);
        backToMultiplyMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveBackToMultiplyMenuIntent = new Intent(MultiplyTutorial.this,MultiplyMenu.class);
                startActivity(moveBackToMultiplyMenuIntent);
            }
        }
        );


    }
}
