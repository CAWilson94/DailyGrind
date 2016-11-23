package com.example.charl.dailygrind;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

import static com.example.charl.dailygrind.R.layout.activity_list_view;

/**
 * Created by charl on 23/11/2016.
 */
public class ListDisplay extends Activity{

    // Array of strings...
    String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry",
            "WebOS", "Ubuntu", "Windows7", "Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved_coffee);

        ArrayAdapter adapt = new ArrayAdapter<String>(this,R.layout.activity_list_view, mobileArray);

        ListView listView = (ListView) findViewById(R.id.saved_list);
        listView.setAdapter(adapt);
    }
}
