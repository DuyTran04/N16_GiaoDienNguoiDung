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

public class XML_Layout extends AppCompatActivity {
    Button btnVAV, btnCL, btnToast, btnAD,btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_xml_layout);
        addcontrol();
        btnVAV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XML_Layout.this, ViewAndViewGroup.class);
                startActivity(intent);
            }
        });
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XML_Layout.this, Toast.class);
                startActivity(intent);
            }
        });
        btnAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XML_Layout.this, AlertDialog.class);
                startActivity(intent);
            }
        });
        btnCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XML_Layout.this, CommonLayout.class);
                startActivity(intent);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void addcontrol() {
        btnVAV=(Button) findViewById(R.id.btnVAV);
        btnCL=(Button) findViewById(R.id.btnCL);
        btnToast=(Button)findViewById(R.id.btnToast);
        btnAD=(Button) findViewById(R.id.btnAD);
        btnback=(Button) findViewById(R.id.btnback);
    }
}