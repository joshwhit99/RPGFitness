package joshwhittle.rpgfitness;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
    }



}
