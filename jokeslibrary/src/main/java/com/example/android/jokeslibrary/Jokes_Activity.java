package com.example.android.jokeslibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Jokes_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        TextView textview = (TextView) findViewById(R.id.tv_Jokes);

//Retrieve the joke from the Intent Extras
        String JokeResult = null;
//the Intent that started us
        Intent intent = getIntent();
        JokeResult = intent.getStringExtra(getString(R.string.jokeEnvelope));

        if (JokeResult != null) {
            textview.setText(JokeResult);
        } else {
            textview.setText("Dig deeped, we gotta find the joke!");
        }
    }
}
