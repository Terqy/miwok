package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numbersTextView, phrasesTextView, colorsTextView, familyMembersTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbersTextView = (TextView) findViewById(R.id.numbers);
        phrasesTextView = (TextView) findViewById(R.id.phrases);
        colorsTextView = (TextView) findViewById(R.id.colors);
        familyMembersTextView = (TextView) findViewById(R.id.family);

        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, numbers_activity.class);
                startActivity(i);
            }
        });

        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, phrases_activity.class);
                startActivity(i);
            }
        });

        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, colors_activity.class);
                startActivity(i);
            }
        });

        familyMembersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Familymembers_activity.class);
                startActivity(i);
            }
        });
    }
}
