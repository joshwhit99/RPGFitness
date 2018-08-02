package joshwhittle.rpgfitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView introTextView = (TextView) findViewById(R.id.IntroTextView);
        TextView welcomeTextView = (TextView) findViewById(R.id.welcomeTextView);
        //introTextView.setText("RPG Fitness");
        introTextView.setText("Welcome to RPG Fitness, the app that shows you your attributes and helps to grow them");
        welcomeTextView.setText("RPG Fitness");
        Button welcomeStatsButton = (Button)findViewById(R.id.welcomeStatsButton);

        welcomeStatsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this,showStats.class));
            }

        });
    }




}
