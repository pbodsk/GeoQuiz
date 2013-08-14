package dk.jyskebank.android.geoquiz;

/**
 * Created by jb3579 on 08/08/13.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;
    private boolean mUserHasCheatedOnThisQuestion;

    public TrueFalse(int question, boolean trueQuestion){
        setQuestion(question);
        setTrueQuestion(trueQuestion);
        mUserHasCheatedOnThisQuestion = false;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

    public boolean isUserHasCheatedOnThisQuestion() {
        return mUserHasCheatedOnThisQuestion;
    }

    public void setUserHasCheatedOnThisQuestion(boolean userHasCheatedOnThisQuestion) {
        mUserHasCheatedOnThisQuestion = userHasCheatedOnThisQuestion;
    }
}
