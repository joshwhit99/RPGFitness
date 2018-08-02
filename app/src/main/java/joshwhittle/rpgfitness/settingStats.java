package joshwhittle.rpgfitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class settingStats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_stats);
        Button buttonSettingStatsStrength = (Button)findViewById(R.id.buttonSettingStatsStrength);
        buttonSettingStatsStrength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(settingStats.this,Strength.class));
            }
        });
        Button buttonSettingStatsConstitution = (Button)findViewById(R.id.buttonSettingStatsConstitution);
        buttonSettingStatsConstitution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(settingStats.this,Constitution.class));
            }
        });
        Button buttonSettingStatsDextarity = (Button)findViewById(R.id.buttonSettingStatsDextarity);
        buttonSettingStatsDextarity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(settingStats.this,Dextarity.class));
            }
        });
        Button buttonSettingStatsEndurance = (Button)findViewById(R.id.buttonSettingStatsEndurance);
        buttonSettingStatsEndurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(settingStats.this,Endurance.class));
            }
        });
        Button buttonSettingStatsStamina = (Button)findViewById(R.id.buttonSettingStatsStamina);
        buttonSettingStatsStamina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(settingStats.this,Stamina.class));
            }
        });
        Button buttonSettingStatsWisdom = (Button)findViewById(R.id.buttonSettingStatsWisdom);
        buttonSettingStatsWisdom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(settingStats.this,Wisdom.class));
            }
        });
    }
}
