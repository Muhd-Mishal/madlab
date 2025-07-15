package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare variables for EditText and Button
    EditText editTextUsername, editTextPassword;
    Button loginButton;

    // Admin credentials (hardcoded for simplicity)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Use the correct layout file

        // Initialize EditText and Button from layout
        editTextUsername = findViewById(R.id.text1);
        editTextPassword = findViewById(R.id.text2);
        loginButton = findViewById(R.id.buttonLogin);

        // Set up click listener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the username and password entered by the user
                String enteredUsername = editTextUsername.getText().toString();
                String enteredPassword = editTextPassword.getText().toString();

                // Check if the entered username and password match the admin credentials
                if (enteredUsername.equals("admin") && enteredPassword.equals("123")) {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

