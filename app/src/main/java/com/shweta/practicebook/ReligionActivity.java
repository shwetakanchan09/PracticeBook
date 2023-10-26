package com.shweta.practicebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ReligionActivity extends AppCompatActivity {

    LinearLayout llHindu,llMuslim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religion);

        llHindu = findViewById(R.id.llHindu);
        llMuslim = findViewById(R.id.llMuslim);

        String gender = getIntent().getStringExtra("gender");

        llHindu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ReligionActivity.this, ApiCallingActivity.class);
                i.putExtra("religion","10");
                i.putExtra("gender",gender);
                startActivity(i);
            }
        });
        llMuslim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ReligionActivity.this, ApiCallingActivity.class);
                i.putExtra("religion","8");
                i.putExtra("gender",gender);
                startActivity(i);
            }
        });
    }
}