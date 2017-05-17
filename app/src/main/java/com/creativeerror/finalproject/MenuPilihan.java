package com.creativeerror.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuPilihan extends AppCompatActivity {
    ImageButton mQuizButton;
    ImageButton mBelajarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pilihan);

        mQuizButton = (ImageButton) findViewById(R.id.QuizButton);
        mBelajarButton = (ImageButton) findViewById(R.id.BelajarButton2);

        mBelajarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents;
                intents = new Intent(MenuPilihan.this, MainMenuActivity.class);
                startActivity(intents);

            }
        });
        mQuizButton.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent intents;
                intents = new Intent(MenuPilihan.this, QuizActivity.class);
                startActivity(intents);

            }
        });
    }
}
