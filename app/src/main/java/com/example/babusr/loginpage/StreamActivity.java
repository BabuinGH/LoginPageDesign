package com.example.babusr.loginpage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by babusr on 9/23/15.
 */
public class StreamActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView lvActionItems = (ListView) findViewById(R.id.lvActionItems);

        List listItems = new ArrayList();
        listItems.add("First Item");
        listItems.add("Second Item");
        listItems.add("Third Item");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listItems
        );

        lvActionItems.setAdapter(arrayAdapter);
    }
}
