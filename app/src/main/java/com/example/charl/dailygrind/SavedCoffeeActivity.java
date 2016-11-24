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

        String[] stuff = {"Type:           Americano\nSize:            250ml\nCal:              20 kcal \nLocation:    Custom\nCaffiene:     250mg", "Type:           Cappucino\nSize:            250ml\nCal:              200 kcal \nLocation:    Starbucks\nCaffiene:     100mg", "Type:           Mocha\nSize:            250ml\nCal:              290 kcal \nLocation:    Starbucks\nCaffiene:     130mg", "Type:           Caramel Frap\nSize:            250ml\nCal:              270 kcal \nLocation:    Starbucks\nCaffiene:     170mg","Type:           Instant Coffee\nSize:            200ml\nCal:              20 kcal \nLocation:    Home\nCaffiene:     200mg","Type:           Espresso\nSize:            250ml\nCal:              20 kcal \nLocation:    Cafe Nero\nCaffiene:     250mg", "Type:           Americano\nSize:            200ml\nCal:              20 kcal \nLocation:    Tinder Box\nCaffiene:     150mg"};

        final ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                 stuff);

        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String stuffSelected = "You selected " + String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(SavedCoffeeActivity.this, "Tinderbox Americano", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
