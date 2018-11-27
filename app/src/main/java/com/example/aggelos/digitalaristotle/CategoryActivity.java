package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aggelos.myapplication.R;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button math = (Button)findViewById(R.id.btnMath);
        Button comp = (Button)findViewById(R.id.btnComp);
        Button phys = (Button)findViewById(R.id.btnPhys);
        Button chem = (Button)findViewById(R.id.btnChem);

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, MathActivity.class);
                startActivity(intent);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CompActivity.class);
                startActivity(intent);
            }
        });

        phys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, PhysActivity.class);
                startActivity(intent);
            }
        });

        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, ChemActivity.class);
                startActivity(intent);
            }
        });
    }
}
