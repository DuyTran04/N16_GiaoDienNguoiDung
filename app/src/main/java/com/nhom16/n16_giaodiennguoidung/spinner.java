package com.nhom16.n16_giaodiennguoidung;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class spinner extends AppCompatActivity {

    private Spinner spinnerStudents;
    private List<String> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spinner);
        // Ánh xạ Spinner từ XML
        spinnerStudents = findViewById(R.id.spinnerStudents);

        // Tạo danh sách sinh viên mẫu
        studentList = new ArrayList<>();
        studentList.add("Trần Đình Anh Duy");
        studentList.add("Dương Nguyễn Anh Quân");
        studentList.add("Hoàng Minh Trí");


        // Tạo ArrayAdapter để hiển thị danh sách sinh viên trên Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, studentList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Đặt adapter cho Spinner
        spinnerStudents.setAdapter(adapter);

        // Xử lý sự kiện chọn sinh viên từ Spinner
        spinnerStudents.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedStudent = parent.getItemAtPosition(position).toString();
                android.widget.Toast.makeText(spinner.this, "Selected student: " + selectedStudent, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Xử lý khi không có sinh viên nào được chọn
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