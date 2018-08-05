package joshwhittle.rpgfitness;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateWorkout extends AppCompatActivity {
    public static final String MY_PREFS_NAME = "MyPrefsFile";
  /*  public void WorkoutName(View w){
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        EditText editTextCreateWorkoutText1 = (EditText) findViewById(R.id.editTextCreateWorkoutText1);
        editor.putString("WorkoutName",editTextCreateWorkoutText1.getText().toString());
        editor.apply();
   */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_workout);
        //SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
       // EditText editTextCreateWorkoutText1 = (EditText) findViewById(R.id.editTextCreateWorkoutText1);
       // String test = editTextCreateWorkoutText1.getText().toString();

       // editor.putString("WorkoutName",editTextCreateWorkoutText1.getText().toString());
       // editor.apply();
        Button buttonCreateWorkoutAddExercise = (Button)findViewById(R.id.buttonCreateWorkoutAddExercise);
        buttonCreateWorkoutAddExercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
                EditText editTextCreateWorkoutText1 = (EditText) findViewById(R.id.editTextCreateWorkoutText1);
                editor.putString("WorkoutName",editTextCreateWorkoutText1.getText().toString());
                editor.apply();
                startActivity(new Intent(CreateWorkout.this,Exercizes.class));
            }
        });

    }

}
