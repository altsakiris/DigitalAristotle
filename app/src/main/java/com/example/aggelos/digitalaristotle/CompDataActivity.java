package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.aggelos.myapplication.R;

public class CompDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_data);

        Button SQL = (Button)findViewById(R.id.btnSQL);
        Button MySql = (Button)findViewById(R.id.btnMySql);
        Button PoSql = (Button)findViewById(R.id.btnPoSql);
        Button SPARQL = (Button)findViewById(R.id.btnSPARQL);

        SQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompDataActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "SQL tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });

        MySql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompDataActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "MySql tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });

        PoSql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompDataActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "PostgreSQL tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });

        SPARQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompDataActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "SPARQL tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });
    }
}
