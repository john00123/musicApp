package com.example.john.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Set a click listener on the Store View

        View store = (View) findViewById(R.id.numbers);
        store.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
              // Create a new intent to open the {@link StoreActivity}
              Intent storeIntent = new Intent(MainActivity.this, StoreActivity.class);

              // Start the new activity
              startActivity(storeIntent);
            }
        });


        // Set a click listener on the Radio View

        View radio = (View) findViewById(R.id.radio);
        radio.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
              // Create a new intent to open the {@link RadioActivity}
              Intent radioIntent = new Intent(MainActivity.this, RadioActivity.class);

              // Start the new activity
              startActivity(radioIntent);
            }
        });


        // Set a click listener on the Radio View

        View playNow = (View) findViewById(R.id.playNow);
        playNow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
              // Create a new intent to open the {@link RadioActivity}
              Intent playNowIntent = new Intent(MainActivity.this, PlayNowActivity.class);

              // Start the new activity
              startActivity(playNowIntent);
            }
        });


    }
}
