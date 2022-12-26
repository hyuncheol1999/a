package com.example.myapplication44;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class box2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    ImageView iv_item;
    ImageView tv_item;
    ArrayAdapter<String> adapter = null;
    Spinner spinner = null;

    String[] items = {"캔", "캔햄, 통조림"};
    int[] itemImgs1 = {R.drawable.rebox20, R.drawable.rebox21};
    int[] itemImgs2 = {R.drawable.rebox201, R.drawable.rebox211};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.box2);

        iv_item = findViewById(R.id.iv_item);
        tv_item = findViewById(R.id.tv_item);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinner=findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        iv_item.setImageResource(itemImgs1[i]);
        tv_item.setImageResource(itemImgs2[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        iv_item.setImageResource(itemImgs1[0]);
        tv_item.setImageResource(itemImgs2[0]);
    }
}