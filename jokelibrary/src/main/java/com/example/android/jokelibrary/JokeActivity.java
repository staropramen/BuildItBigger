package com.example.android.jokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static String JOKE_KEY = "joke-key";
    private TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        jokeTextView = (TextView) findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKE_KEY);

        jokeTextView.setText(joke);
    }
}
