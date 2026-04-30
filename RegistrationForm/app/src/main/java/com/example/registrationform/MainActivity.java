package com.example.registrationform;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail;
    RadioGroup radioGroup;
    CheckBox cbReading, cbSports;
    ToggleButton toggleStatus;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        radioGroup = findViewById(R.id.radioGroup);
        cbReading = findViewById(R.id.cbReading);
        cbSports = findViewById(R.id.cbSports);
        toggleStatus = findViewById(R.id.toggleStatus);
        btnSubmit = findViewById(R.id.btnSubmit);

        // Event Handler for Button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();
                String email = etEmail.getText().toString();

                // Gender
                int selectedId = radioGroup.getCheckedRadioButtonId();
                RadioButton rb = findViewById(selectedId);
                String gender = (rb != null) ? rb.getText().toString() : "Not Selected";

                // Hobbies
                String hobbies = "";
                if (cbReading.isChecked()) hobbies += "Reading ";
                if (cbSports.isChecked()) hobbies += "Sports ";

                // Toggle Status
                String status = toggleStatus.isChecked() ? "Active" : "Inactive";

                // Display Result
                String result = "Name: " + name +
                        "\nEmail: " + email +
                        "\nGender: " + gender +
                        "\nHobbies: " + hobbies +
                        "\nStatus: " + status;

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
        });
    }
}