package com.example.popupmenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPopup = findViewById(R.id.btnPopup);

        btnPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(MainActivity.this, btnPopup);

                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

//                        switch (item.getItemId()) {
//                            case R.id.edit:
//                                Toast.makeText(MainActivity.this, "Edit Clicked", Toast.LENGTH_SHORT).show();
//                                return true;
//
//                            case R.id.delete:
//                                Toast.makeText(MainActivity.this, "Delete Clicked", Toast.LENGTH_SHORT).show();
//                                return true;
//
//                            case R.id.share:
//                                Toast.makeText(MainActivity.this, "Share Clicked", Toast.LENGTH_SHORT).show();
//                                return true;
//
//                            default:
//                                return false;
//                        }
                        if (item.getItemId() == R.id.edit) {
                            Toast.makeText(MainActivity.this, "Edit Clicked", Toast.LENGTH_SHORT).show();
                            return true;

                        } else if (item.getItemId() == R.id.delete) {
                            Toast.makeText(MainActivity.this, "Delete Clicked", Toast.LENGTH_SHORT).show();
                            return true;

                        } else if (item.getItemId() == R.id.share) {
                            Toast.makeText(MainActivity.this, "Share Clicked", Toast.LENGTH_SHORT).show();
                            return true;
                        }
                        return false;
                    }
                });

                popupMenu.show();
            }
        });
    }
}