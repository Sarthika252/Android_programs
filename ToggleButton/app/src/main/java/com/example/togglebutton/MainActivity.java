package com.example.togglebutton;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleBtn;
    TextView statusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleBtn = findViewById(R.id.toggleBtn);
        statusText = findViewById(R.id.statusText);

        toggleBtn.setOnCheckedChangeListener((buttonView, isChecked) -> {

            if (isChecked) {
                Toast.makeText(MainActivity.this, "Toggle ON", Toast.LENGTH_SHORT).show();
                statusText.setText("Status: ON");
            } else {
                Toast.makeText(MainActivity.this, "Toggle OFF", Toast.LENGTH_SHORT).show();
                statusText.setText("Status: OFF");
            }

        });
    }
}