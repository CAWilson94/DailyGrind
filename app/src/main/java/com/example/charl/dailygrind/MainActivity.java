package com.example.charl.dailygrind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
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
        Intent intent = new Intent(MainActivity.this, CustomCoffeeActivity.class);
        startActivity(intent);

    }

    public void onGetCustomMapClick(View view) {
        Intent mapIntent = new Intent(MainActivity.this, MapCoffeeActivity.class);
        startActivity(mapIntent);
    }
}
