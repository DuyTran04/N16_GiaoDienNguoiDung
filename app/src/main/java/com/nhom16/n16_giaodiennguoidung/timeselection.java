package com.nhom16.n16_giaodiennguoidung;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class timeselection extends AppCompatActivity {

        private Button btnPickTime;
        private int hour, minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_timeselection);
        btnPickTime = findViewById(R.id.btnPickTime);

        // Lấy thời gian hiện tại
        final Calendar calendar = Calendar.getInstance();
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);

        // Bắt sự kiện click để mở TimePickerDialog
        btnPickTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(timeselection.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                hour = hourOfDay;
                                timeselection.this.minute = minute;

                                // Hiển thị thời gian đã chọn
                                String time = hour + ":" + minute;
                                btnPickTime.setText(time);
                            }
                        }, hour, minute, true);
                timePickerDialog.show();
            }
        });


    }
}