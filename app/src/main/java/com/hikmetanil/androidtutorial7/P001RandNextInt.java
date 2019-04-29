package com.hikmetanil.androidtutorial7;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class P001RandNextInt extends Activity {
    TextView textViewP001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p001_rand_next_int);

        textViewP001= findViewById(R.id.textViewP001);

    }

    public void onClickMtdP001(View view) {
        Random random=new Random();
        String randomNumberSV= String.valueOf(20+random.nextInt((100-20)+1));
        textViewP001.setText(randomNumberSV);
    }
}
