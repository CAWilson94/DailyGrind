package com.example.charl.dailygrind;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
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
        /* Using an intent: and intention to do something!
           Do so by passing context as well as activity we want to open
         */
        Intent getCoffeeNameIntent = new Intent(this, CustomCoffee.class);
        // When clicked - second screen open
        final int result = 1;
        // Put data we want over to second screen
        getCoffeeNameIntent.putExtra("callingActivity", "MainActivity"); // key given, value want to retrieve
        // call for that activity to run..
        startActivityForResult(getCoffeeNameIntent, result);// call activity and get result back
    }

    /**
     * Need to handle the coffee name being sent back after the custom coffee screen closes
     * Generate: override methods.
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // create text view to put coffee custom name inside of it
        TextView coffeeNameMessage = (TextView) findViewById(R.id.name_enter_coffee); //TODO: fix dis
        // get coffee name value
        String sentBackCoffee = data.getStringExtra("coffeeName");
        coffeeNameMessage.append("" + sentBackCoffee);
    }

    PopupWindow pWin;
    LayoutInflater linf;
    RelativeLayout relativeLayout;
    PopupWindow pop;


    public void MakeMoreButtonsOnClick(View view) {
        relativeLayout = (RelativeLayout) findViewById(R.id.main_view_layout);
        // Want to create two new buttons on click: probably need to pass in transparent xml
        linf = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        // Need new layout for the window
        ViewGroup container = (ViewGroup) linf.inflate(R.layout.xtra_buttons, null);
        // Create a window for the buttons to stay on..
        pWin = new PopupWindow(container,400,400);
        pWin.setBackgroundDrawable(new BitmapDrawable());
        pWin.setOutsideTouchable(true); // modal pls
        // Need to actually shwo the window
        pWin.showAtLocation(relativeLayout, Gravity.NO_GRAVITY, 500, 500); // represent location of pop up window
        // Want to close window when click outside of it: like a modal!
    }
}
