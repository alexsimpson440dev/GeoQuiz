package com.bignerdranch.android.geoquiz;

/**
 * Created by Alex on 9/4/16.
 */
public class Questions {

    //variables that read the id and if the answer is true
    private int mTextResId;
    private boolean mAnswerTrue;

    //sets the variables equal to a methods variables
    public Questions(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    //getter for the text id
    public int getTextResId() {
        return mTextResId;
    }

    //setter for the text id
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    //getter for the answer true
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    //setter for the answer true
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

}
