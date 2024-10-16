package com.nhom16.n16_giaodiennguoidung;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Toast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_toast);

        Button buttonshort = (Button) findViewById(R.id.toastshort);
        buttonshort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.widget.Toast.makeText(Toast.this, "This is a Toast message", android.widget.Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonlong = (Button) findViewById(R.id.toastlong);
        buttonlong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.widget.Toast.makeText(Toast.this, "This is a Toast message", android.widget.Toast.LENGTH_LONG).show();
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