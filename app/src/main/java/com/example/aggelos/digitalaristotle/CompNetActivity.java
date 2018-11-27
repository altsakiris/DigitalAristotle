package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.aggelos.myapplication.R;

public class CompNetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_net);

        Button LAN = (Button)findViewById(R.id.btnLAN);
        Button MAN = (Button)findViewById(R.id.btnMAN);
        Button WAN = (Button)findViewById(R.id.btnWAN);

        LAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompNetActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "LAN network tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });

        MAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompNetActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "MAN network tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });

        WAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompNetActivity.this, SearchActivity.class);
                intent.putExtra("searchQuery", "WAN network tutorial");
                intent.putExtra("category", "comp");
                startActivity(intent);
            }
        });

    }
}
