package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mTitle;
    private Button mProceedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProceedButton = (Button) findViewById(R.id.proceedButton);
        mTitle = (TextView) findViewById(R.id.appNameTextView);

        Typeface shadedFont = Typeface.createFromAsset(getAssets(),"fonts/fontone.ttf");
        mTitle.setTypeface(shadedFont);

        mProceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "let's ndu-thisss", Toast.LENGTH_LONG).show();
            }
        });
    }
}
