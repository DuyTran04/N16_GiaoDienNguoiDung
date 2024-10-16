package com.nhom16.n16_giaodiennguoidung;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class intent2 extends AppCompatActivity {

    private TextView txtIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intent2);

        txtIntent = findViewById(R.id.txt_intent);

        Intent intent = getIntent();

        if (intent != null) {
            if(intent.hasExtra("text")) {
                String text = intent.getStringExtra("text");
                txtIntent.setText(text);
            }
        }
    }
}