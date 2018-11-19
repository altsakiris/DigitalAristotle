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

        Button btnJava = (Button)findViewById(R.id.btnJava);
        Button btnCpp = (Button)findViewById(R.id.btnCpp);
        Button btnPython = (Button)findViewById(R.id.btnPython);
        Button btnPHP = (Button)findViewById(R.id.btnPHP);

        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompProgActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "java tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });
    }



}
