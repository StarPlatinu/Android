package com.training;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner sp,sp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test5);
        sp = findViewById(R.id.sp2);
        sp1 = findViewById(R.id.sp1);
        String[] list = {"FPT","PTIT","HUST","NEU"};
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.item,list);
        sp.setAdapter(adapter);
        String[] list1 = getResources().getStringArray(R.array.country);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,R.layout.item,list1);
        sp1.setAdapter(adapter1);
    }
}