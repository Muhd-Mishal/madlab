package com.example.prg2;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    protected void onStart(){
        super.onStart();
        Log.i("Activity Lifecycle","the onstart function is working");
        Toast.makeText(this, "the onStart function is working", Toast.LENGTH_SHORT).show();
    }

    protected void onResume(){
        super.onResume();
        Log.i("Activity Lifecycle","the onResume is working");
        Toast.makeText(this, "the resume function is working", Toast.LENGTH_SHORT).show();
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "the onPause is working", Toast.LENGTH_SHORT).show();
    }

    protected void onStop(){
        super.onStop();

        Toast.makeText(this, "the onStop function is working", Toast.LENGTH_SHORT).show();
    }

    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "the restart is function is working", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "the onDestroy function is working", Toast.LENGTH_SHORT).show();
    }
}