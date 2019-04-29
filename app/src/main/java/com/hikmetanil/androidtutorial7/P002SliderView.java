package com.hikmetanil.androidtutorial7;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

public class P002SliderView extends AppCompatActivity {
    ArrayList<Integer> arrayListImages;
    RecyclerView recyclerViewP002;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p002_slider_view);

        arrayListImages=new ArrayList<>();
        arrayListImages.add(R.drawable.pic1);
        arrayListImages.add(R.drawable.pic2);
        arrayListImages.add(R.drawable.pic3);

        recyclerViewP002 = findViewById(R.id.recyclerViewP002);
    }

    public void onClickMtdP002(View view) {

    }
}
