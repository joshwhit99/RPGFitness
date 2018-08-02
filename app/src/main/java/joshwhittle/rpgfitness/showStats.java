package joshwhittle.rpgfitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class showStats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_stats);

        Button buttonShowStatsEnterStats = (Button)findViewById(R.id.buttonShowStatsEnterStats);
        buttonShowStatsEnterStats.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(showStats.this,settingStats.class));
            }
        });
    }
}
