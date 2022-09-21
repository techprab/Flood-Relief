

package com.hackathon.floodreleif;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class DangerAreas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.danger_area_ngo);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Address1");
        list.add("Address2");
        list.add("Address3");
        list.add("Address4");
        list.add("Address5");

        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

    }
}
