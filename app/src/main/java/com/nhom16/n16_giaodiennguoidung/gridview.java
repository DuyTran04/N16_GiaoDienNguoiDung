package com.nhom16.n16_giaodiennguoidung;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class gridview extends AppCompatActivity {
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gridview);
        gridView = findViewById(R.id.gridView);

        // Tạo danh sách dữ liệu mẫu cho GridView
        List<String> dataList = new ArrayList<>();
        dataList.add("Item 1");
        dataList.add("Item 2");
        dataList.add("Item 3");
        dataList.add("Item 4");
        dataList.add("Item 5");
        dataList.add("Item 6");
        dataList.add("Item 7");
        dataList.add("Item 8");
        dataList.add("Item 9");

        // Tạo ArrayAdapter để hiển thị danh sách dữ liệu trên GridView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);

        // Đặt adapter cho GridView
        gridView.setAdapter(adapter);
    }
}
