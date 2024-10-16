package com.nhom16.n16_giaodiennguoidung;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class autocomplete extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_autocomplete);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        // Tạo một mảng chứa dữ liệu gợi ý
        String[] suggestions = {"Apple", "Banana", "Orange", "Pineapple","Android","ASP.Net" };

        // Tạo ArrayAdapter với dữ liệu gợi ý và layout mặc định
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, suggestions);

        // Thiết lập adapter cho AutoCompleteTextView
        autoCompleteTextView.setAdapter(adapter);

        Button back = (Button) findViewById(R.id.btnback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}