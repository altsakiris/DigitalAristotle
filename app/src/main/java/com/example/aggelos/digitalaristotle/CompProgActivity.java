package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.aggelos.myapplication.R;

public class CompProgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_prog);

        Button Java = (Button)findViewById(R.id.btnJava);
        Button Cpp = (Button)findViewById(R.id.btnCpp);
        Button Python = (Button)findViewById(R.id.btnPython);
        Button PHP = (Button)findViewById(R.id.btnPHP);

        Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompProgActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "java tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });

        Cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompProgActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "c++ tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });

        Python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompProgActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "python tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });

        PHP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompProgActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "php tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });
    }



}
