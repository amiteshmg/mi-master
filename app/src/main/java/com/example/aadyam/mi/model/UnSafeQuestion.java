package com.example.aadyam.mi.model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

class UnSafeQuestion {

    @SerializedName("UnsafeQueListForAllInspIdResult")
    // @SerializedName("UnsafeQueListForAllInspIdResult")
    private List<QuestionList> questionList;


    public List<QuestionList> getQuestionList()
    {
        return questionList;
    }

    public void setQuestionList(ArrayList<QuestionList> questionList) {
        this.questionList = questionList;
    }



    @NonNull
    @Override
    public String toString()
    {
        return "[ POJO UnsafeQuestions : { "+questionList+" } ]";
    }

}
