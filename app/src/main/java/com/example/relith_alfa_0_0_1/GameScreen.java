package com.example.relith_alfa_0_0_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameScreen extends AppCompatActivity {

    ImageView image;
    TextView textCh, textD;
    Button nextButton;
    Story story = new Story(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        image = (ImageView)findViewById(R.id.gameImageView);
        textCh = (TextView)findViewById(R.id.gameTextViewCharacter);
        textD = (TextView)findViewById(R.id.gameTextViewDialogue);
        nextButton = (Button)findViewById(R.id.nextButton);

        story.startingPoint();
    }

    public void buttonNext(View view){
        story.selectPosition(story.nextPosition);
    }
}