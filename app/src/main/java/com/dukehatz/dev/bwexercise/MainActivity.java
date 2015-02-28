package com.dukehatz.dev.bwexercise;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    Button button_push;
    Button button_pull;
    Button button_squat;
    Button button_dip;
    Button button_sit;
    Button button_jump;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_dip = (Button) findViewById(R.id.button_dip);

        button_dip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Dips.class);
                startActivity(intent);
            }
        });
    }


}
