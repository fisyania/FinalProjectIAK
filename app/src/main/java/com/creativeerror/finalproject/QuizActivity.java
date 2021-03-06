package com.creativeerror.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {
    TextView mTextQuestion;
    Button mBtnSubmit;
    RadioGroup optionGroup;
    RadioButton optionA, optionB,optionC,optionD;
    List<ModelQuiz> quizModelList = new ArrayList<>();
    int no = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);mTextQuestion = (TextView) findViewById(R.id.mTextQuestion);
        mBtnSubmit = (Button) findViewById(R.id.mBtnSubmit);
        optionGroup = (RadioGroup) findViewById(R.id.optionGroup);
        optionA = (RadioButton) findViewById(R.id.optionA);
        optionB = (RadioButton) findViewById(R.id.optionB);
        optionC = (RadioButton) findViewById(R.id.optionC);
        optionD = (RadioButton) findViewById(R.id.optionD);
        prepareData();
        setData();

        mBtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(no<quizModelList.size()) {
                    checkAnswer();
                    no++;
                }
                if(no<quizModelList.size()) {
                    setData();
                }
            }
        });
    }





    //digunakan untuk menset soal
    void prepareData(){
        setQuestion("What does CSS stand for?", "Colorful Style Sheets", "Creative Style Sheets", "Computer Style Sheets", "Cascading Style Sheets", "D");
        setQuestion("With this language listed below, which language is used to communicate with database ?", "SQL", "CSS", "PHP", "HTML", "A");
        setQuestion("What does PHP stand for?", "Personal Hypertext Processor", "PHP: Hypertext Preprocessor", "Private Home Page", "Private Home Preprocessor", "B");
        setQuestion("In the answer below, which one is used to control the layout of multiple web pages all at once ?", "CSS", "JAVA", "PHP", "HTML", "A");
        setQuestion("Which language has Object-Oriented-Programming ?", "JAVA", "CSS", "PHP", "HTML", "A");
    }

    void setData(){
        mTextQuestion.setText(quizModelList.get(no).getQuestion());
        optionA.setText(quizModelList.get(no).getOptionA());
        optionB.setText(quizModelList.get(no).getOptionB());
        optionC.setText(quizModelList.get(no).getOptionC());
        optionD.setText(quizModelList.get(no).getOptionD());

    }

    void checkAnswer(){
        int index =0;
        switch (quizModelList.get(no).getAnswer()){
            case "A":
                index =0;
                break;
            case "B":
                index =1;
                break;
            case "C":
                index =2;
                break;
            case "D":
                index =3;
                break;
            default:index=0; break;
        }

        int selectedAnsewer = optionGroup.indexOfChild(findViewById(optionGroup.getCheckedRadioButtonId()));
        if(index == selectedAnsewer){
            Toast.makeText(this, "Correct :D", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Wrong :(", Toast.LENGTH_SHORT).show();
        }
    }


    //fungsi untuk mengeset soal ke model yang kemudian akan dimasukan ke modellist
    void setQuestion(String question, String optionA, String optionB, String optionC, String optionD, String answer){
        ModelQuiz quizModel = new ModelQuiz(question, optionA, optionB, optionC, optionD, answer);
        quizModelList.add(quizModel);
    }






}
