package joshwhittle.rpgfitness;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Exercizes extends AppCompatActivity {

    //List<String> exerciseList = Arrays.asList(new String[]{"benchpress","squat","deadlift"});

    private ListView lv;
    public static final String MY_PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercizes);
        SharedPreferences pref = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        String WorkoutName = pref.getString("WorkoutName", null);
        String[] exerciseList = {"benchpress","squat","deadlift"};

        lv = (ListView) findViewById(R.id.listViewExcercisesList);

        List<String> listViewExcercisesList = new ArrayList<String>();
        for (int i =0; i< exerciseList.length;i++){
            listViewExcercisesList.add(exerciseList[i]);

        }

        //listViewExcercisesList.add(WorkoutName);
        //listViewExcercisesList.add("Squat");
       // listViewExcercisesList.add("Deadlift");
        TextView textViewExercisesExercises = (TextView)findViewById(R.id.textViewExercisesExercises);
        textViewExercisesExercises.setText(WorkoutName);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,android.R.layout.simple_list_item_1,listViewExcercisesList);
        lv.setAdapter(arrayAdapter);

    }
}
