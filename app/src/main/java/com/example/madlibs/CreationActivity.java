package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreationActivity extends AppCompatActivity {
    private TextView mStory;
    private TextView mTitle;
    private Button mNewStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);

        mNewStory = (Button) findViewById(R.id.newStory);
        mStory = (TextView) findViewById(R.id.story);

        Intent intent = getIntent();

        String noun = intent.getStringExtra("noun");
        String nounTwo = intent.getStringExtra("nounTwo");
        String adjective = intent.getStringExtra("adjective");
        String adjectiveTwo = intent.getStringExtra("adjectiveTwo");
        String verb = intent.getStringExtra("verb");
        String adverb = intent.getStringExtra("adverb");
        String exclamation = intent.getStringExtra("exclamation");

        mTitle = (TextView) findViewById(R.id.mainTitle);

        Typeface shadedFont = Typeface.createFromAsset(getAssets(),"fonts/fontone.ttf");
        mTitle.setTypeface(shadedFont);


        mStory.setText("Once upon a time, "+adjective+ " " +noun+" and "+adjectiveTwo+ " " +nounTwo+" were playing by " +
                "the river. The two decided to "+verb+" " +adverb+ ". "+exclamation+"! "+noun+ " screamed causing "+nounTwo+ " to run" +
                " away." );

        mNewStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(CreationActivity.this,  StoryActivity.class);
                startActivity(intent1);

            }
        });
    }
}
