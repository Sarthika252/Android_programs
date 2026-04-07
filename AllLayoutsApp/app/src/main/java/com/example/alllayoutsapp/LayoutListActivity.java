//package com.example.alllayoutsapp;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class LayoutListActivity extends AppCompatActivity {
//
//    ListView listView;
//
//    String[] layouts = {
//            "Linear Layout",
//            "Relative Layout",
//            "Constraint Layout",
//            "Frame Layout",
//            "Table Layout",
//            "Grid Layout",
//            "Scroll Layout",
//            "Absolute Layout"
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_layout_list);
//
//        listView = findViewById(R.id.listView);
//
//        ArrayAdapter<String> adapter =
//                new ArrayAdapter<>(this,
//                        android.R.layout.simple_list_item_1,
//                        layouts);
//
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener((parent, view, position, id) -> {
//
//            Intent intent = new Intent(this, MainActivity.class);
//            intent.putExtra("layout_position", position);
//            startActivity(intent);
//        });
//    }
//}
package com.example.alllayoutsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class LayoutListActivity extends AppCompatActivity {

    String[] layouts = {
            "Linear Layout",
            "Relative Layout",
            "Constraint Layout",
            "Frame Layout",
            "Table Layout",
            "Grid Layout",
            "Scroll View",
            "Absolute Layout"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_list);

        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        layouts);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("layout_position", position);
            startActivity(intent);
        });
    }
}
