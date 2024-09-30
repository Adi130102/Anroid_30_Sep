package com.example.newmyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class seekbar_progressbar_ratingbar extends AppCompatActivity {
  ProgressBar p1,p2h;
  Button b1,b2;
  RatingBar r1;
  TextView t1;
  SeekBar s1;
  int progressstatus =0;
  Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar_progressbar_ratingbar);
       p1 = findViewById(R.id.progressBar);
       p2h = findViewById(R.id.progressBar2);
       b1= findViewById(R.id.buttonp);
       b2 = findViewById(R.id.buttonp2h);
       t1 = findViewById(R.id.textView3);
       s1 = findViewById(R.id.seekBar);

       b2.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                       new Thread(
                               new Runnable() {
                                   @Override
                                   public void run() {
                                       while (progressstatus < 100){
                                           progressstatus += 1;

                                           handler.post(new Runnable() {
                                               @Override
                                               public void run() {
                                                   p2h.setProgress(progressstatus);
                                                   t1.setText(progressstatus + "/" + p2h.getMax());

                                               }
                                           });
                                           try {
                                               Thread.sleep(200);
                                           }catch (InterruptedException e){
                                               e.printStackTrace();
                                           }
                                       }
                                   }
                               }
                       ).start();
                   }
               }
       );

       s1.setOnSeekBarChangeListener(
               new SeekBar.OnSeekBarChangeListener() {
                   @Override
                   public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                       t1.setText("progress " +progress);
                   }

                   @Override
                   public void onStartTrackingTouch(SeekBar seekBar) {
                        t1.setText("Seekbar started");
                   }

                   @Override
                   public void onStopTrackingTouch(SeekBar seekBar) {
                        t1.setText("Seekbar stopped");
                   }
               }
       );

       r1 = findViewById(R.id.ratingBar1);       r1.setRating((float) 1.5);
       r1.setStepSize((float) 0.25);
       r1.setOnRatingBarChangeListener(
               new RatingBar.OnRatingBarChangeListener() {
                   @Override
                   public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                       t1.setText("Rating Bar" + r1.getRating());
                   }
               }
       );
    }
}