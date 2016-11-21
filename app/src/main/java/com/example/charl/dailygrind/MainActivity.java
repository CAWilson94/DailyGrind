package com.example.charl.dailygrind;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button_saved_coffee);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You shall not have coffee!", Toast.LENGTH_LONG).show();

            }
        });
    }

    public void onGetCustomCoffeeClick(View view) {
        /* Using an intent: and intention to do something!
           Do so by passing context as well as activity we want to open
         */

        Intent getCoffeeNameIntent = new Intent(this,CustomCoffee.class );


    }
/*
Adding image view for the coffee logo
 */


}
