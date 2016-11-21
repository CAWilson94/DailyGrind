package com.example.charl.dailygrind;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by charl on 21/11/2016.
 */
public class CustomCoffee extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Need to specify a layout
        setContentView(R.layout.custom_coffee);
        // Another intent to get data passed from main activity!
        Intent activityThatCalled = getIntent();
        String previousActivity = activityThatCalled.getExtras().getString("callingActivity");
        // Display message in custom coffee screen
        TextView callingActivityMessage = (TextView) findViewById(R.id.calling_activity_info_text_view);
        callingActivityMessage.append(" " + previousActivity);
    }

    public void onSendCoffeeName(View view) {
    }
}
