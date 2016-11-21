package com.example.charl.dailygrind;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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
        EditText userCoffeeName = (EditText) findViewById(R.id.coffee_name_edit_text);
        // Get name typed into editable text box
        String coffeeName = String.valueOf(userCoffeeName.getText());
        // Send this back to main activity: using another intent.
        Intent goBackPreviousActivity = new Intent();
        goBackPreviousActivity.putExtra("coffeeName", coffeeName);
        setResult(RESULT_OK,goBackPreviousActivity);
        // screen done working - close with finish
        finish();
    }
}
