package com.example.charl.dailygrind;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by charl on 22/11/2016.
 */
public class SavedCoffeeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved_coffee);
        Toast.makeText(SavedCoffeeActivity.this, "boooop", Toast.LENGTH_SHORT).show();

        String[] stuff = {"Tall Americanoboo    Starbucks", "Tall Americano    Starbucks", "Tall Americano    Starbucks", "Tall Americano    Starbucks", "Tall Americano    Starbucks", "Tall Americano    Starbucks", "Tall Americano    Starbucks", "Tall Americano    Starbucks", "Tall Americano    Starbucks", "Tall Americano    Starbucks", "Tall Americano    Starbucks"};

        final ListAdapter adapter = new customAdapter(this, stuff);

        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String stuffSelected = "You selected " + String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(SavedCoffeeActivity.this, "Starbucks Americano", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
