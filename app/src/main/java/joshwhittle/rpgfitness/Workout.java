package joshwhittle.rpgfitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Workout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        Button buttonWorkoutCreateNewWorkout = (Button)findViewById(R.id.buttonWorkoutCreateNewWorkout);

        buttonWorkoutCreateNewWorkout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(Workout.this,CreateWorkout.class));
            }
        });
    }
}
