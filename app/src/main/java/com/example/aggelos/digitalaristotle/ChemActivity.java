package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aggelos.myapplication.R;

public class ChemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem);

        Button chem1 = (Button)findViewById(R.id.btnChem1);
        Button chem2 = (Button)findViewById(R.id.btnChem2);
        Button chem3 = (Button)findViewById(R.id.btnChem3);
        Button chem4 = (Button)findViewById(R.id.btnChem4);
        Button chem5 = (Button)findViewById(R.id.btnChem5);

        chem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChemActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "organic chemistry tutorial");
                intent.putExtra("category", "chem");
                startActivity(intent);
            }
        });

        chem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChemActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "analytical chemistry tutorial");
                intent.putExtra("category", "chem");
                startActivity(intent);
            }
        });

        chem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChemActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "physical chemistry tutorial");
                intent.putExtra("category", "chem");
                startActivity(intent);
            }
        });

        chem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChemActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "biochemistry tutorial");
                intent.putExtra("category", "chem");
                startActivity(intent);
            }
        });

        chem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChemActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "enorganic chemistry tutorial");
                intent.putExtra("category", "chem");
                startActivity(intent);
            }
        });
    }
}
