package com.nhom16.n16_giaodiennguoidung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class advancedcontrols extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_advancedcontrols);
        Button back= findViewById(R.id.btnback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btnLV = findViewById(R.id.btnLV);
        Button btnS= findViewById(R.id.btnS);
        Button btnSD=findViewById(R.id.btnSD);
        Button btnAC = findViewById(R.id.btnAC);
        Button btnGV=findViewById(R.id.btnGV);
        Button btnTS = findViewById(R.id.btnTS);
        Button btnPG = findViewById(R.id.btnPG);
        Button btnTabS = findViewById(R.id.btnTabS);
        Button btnM =findViewById(R.id.btnM);

        btnLV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advancedcontrols.this, listview.class);
                startActivity(intent);
            }
        });
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advancedcontrols.this, spinner.class);
                startActivity(intent);
            }
        });
        btnSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advancedcontrols.this, slidingdrawer.class);
                startActivity(intent);
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advancedcontrols.this, autocomplete.class);
                startActivity(intent);
            }
        });
        btnGV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advancedcontrols.this, gridview.class);
                startActivity(intent);
            }
        });
        btnTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advancedcontrols.this, timeselection.class);
                startActivity(intent);
            }
        });

        btnPG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advancedcontrols.this, picturegallery.class);
                startActivity(intent);
            }
        });
        btnTabS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advancedcontrols.this, tabselector.class);
                startActivity(intent);
            }
        });
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advancedcontrols.this, menu.class);
                startActivity(intent);
            }
        });

    }
}