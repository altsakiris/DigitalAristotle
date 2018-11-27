package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.aggelos.myapplication.R;

public class PhysClassicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_prog);

        Button classicP1 = (Button)findViewById(R.id.btnClassicP1);
        Button classicP2 = (Button)findViewById(R.id.btnClassicP2);
        Button classicP3 = (Button)findViewById(R.id.btnClassicP3);
        Button classicP4 = (Button)findViewById(R.id.btnClassicP4);

        classicP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysClassicActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "classical mechanics physics tutorial");
                intent.putExtra("category", "phys");
                startActivity(intent);
            }
        });

        classicP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysClassicActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "electromagnetics physics tutorial");
                intent.putExtra("category", "phys");
                startActivity(intent);
            }
        });

        classicP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysClassicActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "thermodynamics physics tutorial");
                intent.putExtra("category", "phys");
                startActivity(intent);
            }
        });

        classicP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysClassicActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "optical physics physics tutorial");
                intent.putExtra("category", "phys");
                startActivity(intent);
            }
        });

    }



}
