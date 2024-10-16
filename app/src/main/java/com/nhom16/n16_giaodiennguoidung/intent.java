package com.nhom16.n16_giaodiennguoidung;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class intent extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intent);
        Button btnEI = (Button) findViewById(R.id.btnEI);
        Button btnII = (Button) findViewById(R.id.btnII);
        Button btnGR = (Button) findViewById(R.id.btnGR);
        Button btnBack = (Button) findViewById(R.id.btnBack);
        EditText editText = findViewById(R.id.editText);

        btnEI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.content.Intent intent = new android.content.Intent(intent.this, intent2.class);
                startActivity(intent);
            }
        });
        btnII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_VIEW, Uri.EMPTY.parse("")); //Copy tên miền website nào đó và Paste link
                startActivity(intent);
            }
        });
        btnGR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.content.Intent intent = new android.content.Intent(intent.this, intent3.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button button2= findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy dữ liệu từ EditText
                String data = editText.getText().toString();

                // Khởi tạo Intent
                android.content.Intent intent = new android.content.Intent(intent.this, intent3.class);
                intent.putExtra("DATA", data);

                // Khởi chạy Activity mới
                startActivity(intent);
            }
        });
    }
}