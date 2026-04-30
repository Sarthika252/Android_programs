package com.example.optionmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Create Option Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // Handle Menu Item Click Events
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.menu_settings) {
            Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (id == R.id.menu_about) {
            Toast.makeText(this, "About Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (id == R.id.menu_exit) {
            Toast.makeText(this, "Exiting App", Toast.LENGTH_SHORT).show();
            finish(); // closes the app
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}