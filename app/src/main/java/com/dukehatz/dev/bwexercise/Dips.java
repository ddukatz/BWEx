package com.dukehatz.dev.bwexercise;

import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.concurrent.TimeUnit;


public class Dips extends ActionBarActivity {

    TextView CountdownTimer;
    Button TimeStart, TimeReset;
    View layoutColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dips);

        TimeStart = (Button) findViewById(R.id.TimeStart);
        TimeReset = (Button) findViewById(R.id.TimeReset);
        CountdownTimer = (TextView) findViewById(R.id.CountdownTimer);
        layoutColor = (View) findViewById(R.id.topSection);

        CountdownTimer.setText("5:00");


        final CounterClass timer = new CounterClass(300000, 1000);
                TimeStart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        timer.start();
                    }
                });
       }


public class CounterClass extends CountDownTimer {

    public CounterClass(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
    }

    @Override
    public void onTick(long millisUntilFinished) {

        long millis = millisUntilFinished;
        String hms = String.format("%02d:%02d",
                TimeUnit.MILLISECONDS.toMinutes(millis),
                TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
        System.out.print(hms);
        CountdownTimer.setText(hms);


    }

    @Override
    public void onFinish() {
    CountdownTimer.setText("Complete!");
    }
}
}
