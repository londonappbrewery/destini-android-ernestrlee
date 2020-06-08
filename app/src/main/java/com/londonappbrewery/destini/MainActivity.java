package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button topButton;
    Button bottomButton;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);

        storyTextView.setText(R.string.T1_Story);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("destini", "onClick: top button clicked");

                switch (mStoryIndex){
                    case 1:
                    case 2:
                        storyTextView.setText(R.string.T3_Story);
                        topButton.setText(R.string.T3_Ans1);
                        bottomButton.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                        break;

                    case 3:
                        storyTextView.setText(R.string.T6_End);
                        topButton.setText("");
                        bottomButton.setText("");
                        mStoryIndex = 6;
                    default:
                        break;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("destini", "onClick: bottom button clicked");

                switch (mStoryIndex){
                    case 1:
                        storyTextView.setText(R.string.T2_Story);
                        topButton.setText(R.string.T2_Ans1);
                        bottomButton.setText(R.string.T2_Ans2);
                        mStoryIndex = 2;
                        break;
                    case 2:
                        storyTextView.setText(R.string.T3_Story);
                        topButton.setText("");
                        bottomButton.setText("");
                        mStoryIndex = 4;
                        break;
                    case 3:
                        storyTextView.setText(R.string.T5_End);
                        topButton.setText("");
                        bottomButton.setText("");
                        mStoryIndex = 5;
                    default:
                        break;
                }
            }
        });

    }
}
