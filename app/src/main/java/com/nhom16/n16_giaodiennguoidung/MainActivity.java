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

public class MainActivity extends AppCompatActivity {
    Button btnXML,btnCC,btnAC,btnCLL,btnWebkit,btnIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnXML=(Button) findViewById(R.id.btnXML);
        btnCC=(Button) findViewById(R.id.btnCC);
        btnAC=(Button) findViewById(R.id.btnAC);
        btnCLL=(Button) findViewById(R.id.btnCLL);
        btnWebkit=(Button) findViewById(R.id.btnWebkit);
        btnIntent=(Button) findViewById(R.id.btnIntent);
    }
    public void btnXML_Onclick(View view){
        Intent intent = new Intent(this, XML_Layout.class);
        startActivity(intent);
    }
    public void btnCC_Onclick(View view){
        Intent intent = new Intent(this, CommonControls.class);
        startActivity(intent);
    }
    public void btnAC_Onclick(View view){
        Intent intent = new Intent(this, advancedcontrols.class);
        startActivity(intent);
    }

    public void btnCLL_Onclick(View view){
        Intent intent = new Intent(this, CustomLayout.class);
        startActivity(intent);
    }
    public void btnWebkit_Onclick(View view){
        Intent intent = new Intent(this, WebKit.class);
        startActivity(intent);
    }
    public void btnIntent_Onclick(View view){
        Intent intent = new Intent(this, intent.class);
        startActivity(intent);
    }
}