package com.example.timothyodonga.mentalmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SquaringPractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squaring_practice);

        Button backToSquaringMenuButton = (Button) findViewById(R.id.squaring_practice_back_button);
        backToSquaringMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToSquaringMenuIntent = new Intent(SquaringPractice.this,SquaringMenu.class);
                startActivity(backToSquaringMenuIntent);
            }
        }
        );

        Button submitAnswersButton = (Button) findViewById(R.id.squaring_answers_button);
        submitAnswersButton.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   submitAnswers(v);
               }
           }
        );

    }

    public void submitAnswers(View view){

        int correctAnswerCount = 0;
        EditText answerOneField = (EditText) findViewById(R.id.squaring_answer_1_edit_text);
        Editable answerOneEditable = answerOneField.getText();
        String answerOne = answerOneEditable.toString();

        if( answerOne.equals("1600") ){
            correctAnswerCount = correctAnswerCount + 1;
        }

        EditText answerTwoField = (EditText) findViewById(R.id.squaring_answer_2_edit_text);
        Editable answerTwoEditable = answerTwoField.getText();
        String answerTwo = answerTwoEditable.toString();

        if(answerTwo.equals("16900") ){
            correctAnswerCount = correctAnswerCount + 1;
        }

        EditText answerThreeField = (EditText) findViewById(R.id.squaring_answer_3_edit_text);
        Editable answerThreeEditable = answerThreeField.getText();
        String answerThree = answerThreeEditable.toString();

        if(answerThree.equals("4225") ){
            correctAnswerCount = correctAnswerCount + 1;
        }

        EditText answerFourField = (EditText) findViewById(R.id.squaring_answer_4_edit_text);
        Editable answerFourEditable = answerFourField.getText();
        String answerFour = answerFourEditable.toString();

        if(answerFour.equals("13225s") ){
            correctAnswerCount = correctAnswerCount + 1;
        }

        TextView divideReportTextView = (TextView) findViewById(R.id.squaring_report_text_view);
        if(correctAnswerCount == 4){
            String result = "All are correct, you are a human computer";
            divideReportTextView.setText(""+result);
        }
        else{
            String result = "Atleast one of your answers is wrong";
            divideReportTextView.setText(""+result);
        }
    }
}
