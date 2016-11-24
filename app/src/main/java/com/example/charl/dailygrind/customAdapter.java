package com.example.charl.dailygrind;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by charl on 24/11/2016.
 */
public class customAdapter extends ArrayAdapter<String> {
    public customAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout_2, values);
    }
}
