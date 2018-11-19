package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aggelos.myapplication.R;

public class CompActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp);

        Button prog = (Button)findViewById(R.id.btnProg);
        Button shm = (Button)findViewById(R.id.btnShm);
        Button data = (Button)findViewById(R.id.btnData);
        Button net = (Button)findViewById(R.id.btnNet);


        prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompActivity.this, CompProgActivity.class);
                startActivity(intent);
            }
        });

        shm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompActivity.this, CompMarkupActivity.class);
                startActivity(intent);
            }
        });

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompActivity.this, CompDataActivity.class);
                startActivity(intent);
            }
        });

        net.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompActivity.this, CompNetActivity.class);
                startActivity(intent);
            }
        });
    }
}
