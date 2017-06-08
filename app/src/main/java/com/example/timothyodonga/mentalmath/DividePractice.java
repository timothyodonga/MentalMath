package com.example.timothyodonga.mentalmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DividePractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide_practice);

        Button submitAnswersButton = (Button) findViewById(R.id.divide_answers_button);
        submitAnswersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswers(v);
            }
        }
        );

        Button moveBackToDividePracticeButton = (Button) findViewById(R.id.divide_practice_back_button);
        moveBackToDividePracticeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveBackToDivideMenu = new Intent(DividePractice.this,DivideMenu.class);
                startActivity(moveBackToDivideMenu);
            }

        }
        );

    }

    public void submitAnswers(View view){

        int correctAnswerCount = 0;
        EditText answerOneField = (EditText) findViewById(R.id.answer_1_edit_text);
        Editable answerOneEditable = answerOneField.getText();
        String answerOne = answerOneEditable.toString();

        if( answerOne.equals("47") ){
            correctAnswerCount = correctAnswerCount + 1;
        }

        EditText answerTwoField = (EditText) findViewById(R.id.answer_2_edit_text);
        Editable answerTwoEditable = answerTwoField.getText();
        String answerTwo = answerTwoEditable.toString();

        if(answerTwo.equals("228") ){
            correctAnswerCount = correctAnswerCount + 1;
        }

        EditText answerThreeField = (EditText) findViewById(R.id.answer_3_edit_text);
        Editable answerThreeEditable = answerThreeField.getText();
        String answerThree = answerThreeEditable.toString();

        if(answerThree.equals("469") ){
            correctAnswerCount = correctAnswerCount + 1;
        }

        TextView divideReportTextView = (TextView) findViewById(R.id.divide_report_text_view);

        if(correctAnswerCount == 3 ){
            String result = "All are correct, you are a human computer";
            divideReportTextView.setText(""+result);
        }
        else{
            String result = "Atleast one of your answers is wrong";
            divideReportTextView.setText(""+result);
        }



    }
}
