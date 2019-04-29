package com.hikmetanil.androidtutorial7;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class P004newString extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p004_new_string);

        Spinner spinnerP004= findViewById(R.id.spinnerP004);

        String[] activityNames=new String[]{"P001","P002","P003","P004","P005","P006",
                "P007","P008","P009","P010","P011","P012","P013","P014","P015","P016"};

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,activityNames);
        spinnerP004.setAdapter(arrayAdapter);

    }
}
