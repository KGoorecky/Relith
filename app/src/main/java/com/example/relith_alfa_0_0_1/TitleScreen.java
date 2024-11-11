package com.example.relith_alfa_0_0_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;


public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_title_screen);

        Button startB = (Button)findViewById(R.id.startButton);

        ImageView titleI = (ImageView)findViewById(R.id.titleImageView);
    }
    public void goGameScreen(View view){
        Intent gameScreen = new Intent(this, GameScreen.class);
        startActivity(gameScreen);
    }
}