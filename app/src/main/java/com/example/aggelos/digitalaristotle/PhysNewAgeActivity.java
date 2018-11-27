package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.aggelos.myapplication.R;

public class PhysNewAgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_prog);

        Button newAge1 = (Button)findViewById(R.id.btnNew1);
        Button newAge2 = (Button)findViewById(R.id.btnNew2);
        Button newAge3 = (Button)findViewById(R.id.btnNew3);
        Button newAge4 = (Button)findViewById(R.id.btnNew4);
        Button newAge5 = (Button)findViewById(R.id.btnNew5);
        Button newAge6 = (Button)findViewById(R.id.btnNew6);

        newAge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysNewAgeActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "quantum physics tutorial");
                intent.putExtra("category", "phys");
                startActivity(intent);
            }
        });

        newAge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysNewAgeActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "elementary physics tutorial");
                intent.putExtra("category", "phys");
                startActivity(intent);
            }
        });

        newAge3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysNewAgeActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "atomic physics tutorial");
                intent.putExtra("category", "phys");
                startActivity(intent);
            }
        });

        newAge4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysNewAgeActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "nuclear physics tutorial");
                intent.putExtra("category", "phys");
                startActivity(intent);
            }
        });

        newAge5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysNewAgeActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "cosmology physics tutorial");
                intent.putExtra("category", "phys");
                startActivity(intent);
            }
        });

        newAge6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysNewAgeActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "concentrated matter physics tutorial");
                intent.putExtra("category", "phys");
                startActivity(intent);
            }
        });
    }



}
