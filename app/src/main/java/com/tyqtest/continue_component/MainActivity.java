package com.tyqtest.continue_component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (Spinner) findViewById(R.id.list_view);
        String [] mItems = getResources().getStringArray(R.array.spinnername);
        ArrayAdapter<String> _Adapter = new ArrayAdapter<String> (this,android.R.layout.simple_spinner_item,mItems);
        listView.setAdapter(_Adapter);

    }
}
