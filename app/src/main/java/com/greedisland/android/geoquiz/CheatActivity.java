package com.greedisland.android.geoquiz;

import android.app.Activity;
import android.os.Bundle;

public class CheatActivity extends Activity {

    public static final String EXTRA_ANSWER_IS_TRUE = "com.greedisland.android.geoquiz.answer_is_true";

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_cheat);
    }
}
