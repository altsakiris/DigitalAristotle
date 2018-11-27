package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aggelos.myapplication.R;

public class MathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        Button math1 = (Button)findViewById(R.id.btnMath1);
        Button math2 = (Button)findViewById(R.id.btnMath2);
        Button math3 = (Button)findViewById(R.id.btnMath3);
        Button math4 = (Button)findViewById(R.id.btnMath4);


        math1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "discrete math tutorial");
                intent.putExtra("category", "math");
                startActivity(intent);
            }
        });

        math2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "arrays math tutorial");
                intent.putExtra("category", "math");
                startActivity(intent);
            }
        });

        math3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "differential calculus math tutorial");
                intent.putExtra("category", "math");
                startActivity(intent);
            }
        });

        math4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "integral calculus math tutorial");
                intent.putExtra("category", "math");
                startActivity(intent);
            }
        });
    }
}
