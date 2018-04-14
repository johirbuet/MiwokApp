package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by mislam on 4/14/18.
 */

public class FamilyClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"Family",Toast.LENGTH_SHORT).show();
    }
}
