package com.example.charl.dailygrind;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by charl on 22/11/2016.
 */
public class xtra extends Activity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xtra_buttons);

        button = (Button) findViewById(R.id.custom_float);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(xtra.this, "I AM A TOAST!", Toast.LENGTH_LONG).show();
            }
        });
    }


}
