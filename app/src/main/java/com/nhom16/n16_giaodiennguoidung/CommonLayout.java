package com.nhom16.n16_giaodiennguoidung;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CommonLayout extends AppCompatActivity {
    private static final String TAG = "CommonLayout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_common_layout);
        Button btnlinearlayout = findViewById(R.id.btn_linear_layout);
        Button btnrelativelayout = findViewById(R.id.btn_relative_layout);
        Button btnframelayout = findViewById(R.id.btn_frame_layout);
        Button btnconstrainlayout = findViewById(R.id.btn_constrain_layout);
        Button btngridlayout = findViewById(R.id.btn_grid_layout);
        Button btntablelayout = findViewById(R.id.btn_table_layout);
        btnlinearlayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CommonLayout.this, CommonLayout2.class);
                startActivity(intent);
            }
        });
        btnrelativelayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CommonLayout.this, CommonLayout3.class);
                startActivity(intent);
            }
        });
        btnframelayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CommonLayout.this, CommonLayout4.class);
                startActivity(intent);
            }
        });
        btnconstrainlayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CommonLayout.this, CommonLayout5.class);
                startActivity(intent);
            }
        });
        btngridlayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CommonLayout.this, CommonLayout6.class);
                startActivity(intent);
            }
        });
        btntablelayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CommonLayout.this, CommonLayout7.class);
                startActivity(intent);
            }
        });
        Button back = (Button) findViewById(R.id.btnback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}