package com.shweta.practicebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtGen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtGen = findViewById(R.id.txtGen);

        Intent i = new Intent(MainActivity.this,GenderChangeActivity.class);
        startActivity(i);
    }
}