package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int likes = 12;
    private TextView likesTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        likesTextView = findViewById(R.id.likesTextView);
        Button likeButton = findViewById(R.id.likeButton);
        Button unlikeButton = findViewById(R.id.unlikeButton);

        updateLikesText();

        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likes++;
                updateLikesText();
            }
        });

        unlikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (likes > 0) {
                    likes--;
                }
                updateLikesText();
            }
        });
    }

    private void updateLikesText() {
        likesTextView.setText(likes + " polubień");
    }
}
