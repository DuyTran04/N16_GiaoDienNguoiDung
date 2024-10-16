package com.nhom16.n16_giaodiennguoidung;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SlidingDrawer;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class slidingdrawer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_slidingdrawer);
        SlidingDrawer slidingDrawer = findViewById(R.id.slidingDrawer);
        ImageView handle = findViewById(R.id.handle);
        TextView content = findViewById(R.id.content);

        // Thiết lập sự kiện khi sliding drawer mở và đóng
        slidingDrawer.setOnDrawerOpenListener(() -> {
            // Xử lý khi sliding drawer mở
        });

        slidingDrawer.setOnDrawerCloseListener(() -> {
            // Xử lý khi sliding drawer đóng
        });

        // Thiết lập sự kiện khi sliding drawer mở hoặc đóng
        slidingDrawer.setOnDrawerScrollListener(new SlidingDrawer.OnDrawerScrollListener() {
            @Override
            public void onScrollStarted() {
                // Xử lý khi sliding drawer bắt đầu cuộn
            }

            @Override
            public void onScrollEnded() {
                // Xử lý khi sliding drawer kết thúc cuộn
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