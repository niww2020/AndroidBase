package com.example.andoidbasecourse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsOfApp extends AppCompatActivity {
    TextView textView;
    ListView listView;
    LinearLayout linearLayout;
    Switch aSwitch;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_of_app);
        aSwitch = findViewById(R.id.switch1);

        findViewById(R.id.buttonBackOfSettings).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.switch1).setClickable(WetherSettingsModel.getInstance().isShow2());
        findViewById(R.id.radioButton).setClickable(true);
//        findViewById(R.id.checkBox).setActivated(WetherSettingsModel.getInstance().show1);
//        findViewById(R.id.checkBox).setEnabled(WetherSettingsModel.getInstance().show1);
//        findViewById(R.id.checkBox2).setPressed(WetherSettingsModel.getInstance().show1);
        ((CheckBox)findViewById(R.id.checkBox3)).setChecked(WetherSettingsModel.getInstance().show1);//todo почему нужно кастить чтобы был метод setChecked

        findViewById(R.id.checkBox2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                WetherSettingsModel.getInstance().setShow1(findViewById();
            }
        });


    }
    public void setDarkModeInSettings(View view) {

//            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        if (aSwitch.isChecked()) {
            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {

            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
//        MainActivity.this.setTheme(R.style.AppDarkTheme);
//        MainActivity.this.recreate();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();

    }
}