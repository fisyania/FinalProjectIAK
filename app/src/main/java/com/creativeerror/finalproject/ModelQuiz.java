package com.creativeerror.finalproject;

/**
 * Created by User on 16/05/2017.
 */

public class ModelQuiz {
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;

    public String getQuestion() {
        return question;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public String getAnswer() {
        return answer;
    }

    private String optionD;
    private String answer;

    public ModelQuiz(String question, String optionA, String optionB, String optionC, String optionD, String answer) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
}
}
