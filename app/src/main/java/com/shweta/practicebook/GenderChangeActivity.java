package com.shweta.practicebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class GenderChangeActivity extends AppCompatActivity {
    LinearLayout llmale, llfemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_change);

        llmale = findViewById(R.id.llMale);
        llfemale = findViewById(R.id.llFemale);


        llmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GenderChangeActivity.this, ReligionActivity.class);
                i.putExtra("gender","1");
                startActivity(i);
//                Intent i = new Intent(GenderChangeActivity.this, ReligionActivity.class);
//                startActivity(i);
            }
        });
        llfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GenderChangeActivity.this, ReligionActivity.class);
                i.putExtra("gender","2");
                startActivity(i);
//                Intent i = new Intent(GenderChangeActivity.this, ReligionActivity.class);
//                startActivity(i);
            }
        });


    }
}