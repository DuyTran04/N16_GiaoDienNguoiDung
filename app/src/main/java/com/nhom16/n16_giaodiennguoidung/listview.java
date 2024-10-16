package com.nhom16.n16_giaodiennguoidung;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class listview extends AppCompatActivity {

    String Nhom_16 [] ={"Trần Đình Anh Duy","Dương Nguyễn Anh Quân","Hoàng Minh Trí"};
    ArrayAdapter<String> nhom16;

    android.widget.ListView listViewStudents;
    EditText editTextText;

    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_listview);

        editTextText = findViewById(R.id.editTextText);
        listViewStudents = findViewById(R.id.listViewStudents);
        btnback=findViewById(R.id.btnback);

        nhom16 = new ArrayAdapter<>(listview.this, android.R.layout.simple_list_item_1, Nhom_16);

        listViewStudents.setAdapter(nhom16);

        // bắt sự kiện khi click

        listViewStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                editTextText.setText("Sinh viên: " + Nhom_16[position]);
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

