package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView result = findViewById(R.id.result);
        EditText quizMark = findViewById(R.id.quizMark);
        EditText homeworkMark = findViewById(R.id.homeworkMark);
        EditText midtermMark = findViewById(R.id.midtermMark);
        EditText finalsMark = findViewById(R.id.finalsMark);
        Button calculate = findViewById(R.id.calculate);
        Button reset = findViewById(R.id.reset);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double quiz = (15* Integer.parseInt(quizMark.getText().toString()))/20;
                double hw =  (25 *Integer.parseInt(homeworkMark.getText().toString()))/15;
                double midterm = Integer.parseInt(midtermMark.getText().toString());
                double finals = (30 * Integer.parseInt(finalsMark.getText().toString()))/35;
                double grade = quiz+hw+midterm+finals;
                result.setText(String.valueOf(grade));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("000000");
                quizMark.setText("");
                homeworkMark.setText("");
                midtermMark.setText("");
                finalsMark.setText("");
            }
        });
    }
}