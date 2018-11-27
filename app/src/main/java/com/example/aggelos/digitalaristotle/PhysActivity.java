package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aggelos.myapplication.R;

public class PhysActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phys);

        Button classic = (Button)findViewById(R.id.btnClassic);
        Button newAge = (Button)findViewById(R.id.btnNewAge);


        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysActivity.this, PhysClassicActivity.class);
                startActivity(intent);
            }
        });

        newAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysActivity.this, PhysNewAgeActivity.class);
                startActivity(intent);
            }
        });
    }
}
