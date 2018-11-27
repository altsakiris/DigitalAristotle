package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.aggelos.myapplication.R;

public class CompMarkupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_markup);


        Button HTML = (Button) findViewById(R.id.btnHTML);
        Button XML = (Button) findViewById(R.id.btnXML);
        Button CSS = (Button) findViewById(R.id.btnCSS);
        Button XAML = (Button) findViewById(R.id.btnXAML);

        HTML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompMarkupActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "HTML tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });

        XML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompMarkupActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "XML tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });

        CSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompMarkupActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "CSS tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });

        XAML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompMarkupActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "XAML tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });
    }
}
