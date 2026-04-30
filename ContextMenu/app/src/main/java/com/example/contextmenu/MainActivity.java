package com.example.contextmenu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        // Register context menu to TextView
        registerForContextMenu(textView);
    }

    // Create Context Menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Choose Option");
        menu.add(0, 1, 0, "Edit");
        menu.add(0, 2, 0, "Delete");
        menu.add(0, 3, 0, "Share");
    }

    // Handle Menu Item Clicks
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case 1:
                Toast.makeText(this, "Edit Clicked", Toast.LENGTH_SHORT).show();
                return true;

            case 2:
                Toast.makeText(this, "Delete Clicked", Toast.LENGTH_SHORT).show();
                return true;

            case 3:
                Toast.makeText(this, "Share Clicked", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }
}