package dk.jyskebank.android.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jb3579 on 14/08/13.
 */
public class CheatActivity extends Activity {

    public static final String EXTRA_ANSWER_IS_TRUE = "dk.jyskebank.android.geoquiz.answer_is_true";
    public static final String EXTRA_ANSWER_SHOWN = "dk.jyskebank.android.geoquiz.answer_shown";
    private static final String KEY_ANSWER_SHOWN = "answer_shown";
    public boolean mAnswerIsTrue;
    private TextView mAnswerTextView;
    private Button mShowAnswerButton;
    private boolean mAnswerIsShown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        if(savedInstanceState != null){
            mAnswerIsShown = savedInstanceState.getBoolean(KEY_ANSWER_SHOWN);
        }
        setAnswerShownResult(mAnswerIsShown);
        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

        mAnswerTextView = (TextView) findViewById(R.id.answerTextView);
        mShowAnswerButton = (Button) findViewById(R.id.showAnswerButton);
        mShowAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mAnswerIsTrue){
                    mAnswerTextView.setText(R.string.true_button);
                } else {
                    mAnswerTextView.setText(R.string.false_button);
                }
                mAnswerIsShown = true;
                setAnswerShownResult(mAnswerIsShown);
            }
        });
    }

    private void setAnswerShownResult(boolean isAnswerShown){
        Intent data = new Intent();
        data.putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown);
        setResult(RESULT_OK, data);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(KEY_ANSWER_SHOWN, mAnswerIsShown);
    }
}
