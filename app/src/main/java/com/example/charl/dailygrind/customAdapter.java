package com.example.charl.dailygrind;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by charl on 24/11/2016.
 */

public class customAdapter extends ArrayAdapter<String> {
    public customAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout_2, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // layout inflater time!
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View inflateView = layoutInflater.inflate(R.layout.row_layout_2, parent, false);
        String AmericanoStarbucks = getItem(position);
        TextView theTextView = (TextView) inflateView.findViewById(R.id.text_view_row_2);
        theTextView.setText(AmericanoStarbucks);

        TextView theTextView2 = (TextView) inflateView.findViewById(R.id.text_view_row_3);
        theTextView2.setText(AmericanoStarbucks);
        ImageView theImageView = (ImageView) inflateView.findViewById(R.id.image_view_1);
        //theImageView.setImageResource(R.drawable.coffeeimage); - if you want to change image
        return inflateView;
    }
}
