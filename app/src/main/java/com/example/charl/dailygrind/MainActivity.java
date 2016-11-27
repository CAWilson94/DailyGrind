package com.example.charl.dailygrind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGetCustomCoffeeClick(View view) {
        Intent customIntent = new Intent(MainActivity.this, CustomCoffeeActivity.class);
        startActivity(customIntent);

    }

    public void onGetMapCoffeeClick(View view) {
        Intent mapIntent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(mapIntent);
    }

    public void onGetSavedCoffeeClick(View view) {
        Intent savedIntent = new Intent(MainActivity.this, SavedCoffeeActivity.class);
        startActivity(savedIntent);
    }
}
