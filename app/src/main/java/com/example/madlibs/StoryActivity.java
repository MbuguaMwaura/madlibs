package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StoryActivity extends AppCompatActivity {
    private EditText mNoun;
    private EditText mNounTwo;
    private EditText mAdjective;
    private EditText mAdjectiveTwo;
    private EditText mVerb;
    private EditText mAdverb;
    private EditText mExclamation;
    private Button mCreate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        mNoun = (EditText) findViewById(R.id.noun);
        mNounTwo = (EditText) findViewById(R.id.nounTwo);
        mAdjective = (EditText) findViewById(R.id.adjective);
        mAdjectiveTwo = (EditText) findViewById(R.id.adjectiveTwo);
        mVerb = (EditText) findViewById(R.id.verb);
        mAdverb = (EditText) findViewById(R.id.adverb);
        mExclamation = (EditText) findViewById(R.id.exclamation);
        mCreate = (Button) findViewById(R.id.create);




        mCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StoryActivity.this, CreationActivity.class);

                Toast.makeText(StoryActivity.this, "check it out", Toast.LENGTH_LONG).show();


                String noun = mNoun.getText().toString();
                String nounTwo = mNounTwo.getText().toString();
                String adjective = mAdjective.getText().toString();
                String adjectiveTwo = mAdjectiveTwo.getText().toString();
                String verb = mVerb.getText().toString();
                String adverb = mAdverb.getText().toString();
                String exclamation = mExclamation.getText().toString();

                intent.putExtra("noun", noun);
                intent.putExtra("nounTwo", nounTwo);
                intent.putExtra("adjective", adjective);
                intent.putExtra("adjectiveTwo", adjectiveTwo);
                intent.putExtra("verb", verb);
                intent.putExtra("adverb", adverb);
                intent.putExtra("exclamation", exclamation);

                startActivity(intent);
            }
        });
    }
}



