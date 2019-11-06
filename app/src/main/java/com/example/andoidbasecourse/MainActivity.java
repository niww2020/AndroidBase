package com.example.andoidbasecourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch aSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//        getDelegate().setLocalNightMode(R.style.AppDarkTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch = findViewById(R.id.switch1);


    }

    public void setDarkMode(View view) {


//        super.setTheme(R.style.AppDarkTheme);

//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//        setTheme(R.style.AppDarkTheme);
//        MainActivity.this.recreate();
        if (aSwitch.isChecked()) {
            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {

            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
//        MainActivity.this.setTheme(R.style.AppDarkTheme);
//        MainActivity.this.recreate();

    }

    public void intentListOfCountry(View view) {
        Intent intent = new Intent(this,ListOfCountryWithoutVisa.class);
//        startActivities(intent);
        startActivity(intent);

    }

    public void intentSittingOfApp(View view) {
        Intent intent = new Intent(this, SettingsOfApp.class);
//        startActivities(intent);
        startActivity(intent);

    }
}
