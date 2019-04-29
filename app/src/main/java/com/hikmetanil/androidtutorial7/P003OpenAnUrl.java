package com.hikmetanil.androidtutorial7;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class P003OpenAnUrl extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p003_open_url);

    }

    public void onClickMtdP003(View view) {
        Uri uriV= Uri.parse("https://play.google.com/store/apps/details?id=hikmetanil.githubmet2");
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, uriV);
            startActivity(intent);
        }
        catch (ActivityNotFoundException e){
            Toast.makeText(this, "Activity not found!", Toast.LENGTH_SHORT).show();
        }
    }
}
