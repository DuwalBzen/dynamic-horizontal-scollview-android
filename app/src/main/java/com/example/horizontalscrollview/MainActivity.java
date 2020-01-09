package com.example.horizontalscrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private ImageButton leftBtn;
    private ImageButton rightBtn;
    private HorizontalScrollView hsv;
    int currentScrollX = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftBtn = (ImageButton) findViewById(R.id.btn_left);
        rightBtn = (ImageButton) findViewById(R.id.btn_right);
        hsv = (HorizontalScrollView) findViewById(R.id.horizontal_scrollview);
        linearLayout = (LinearLayout) findViewById(R.id.dynamic_generation);

     /*   leftBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                hsv.scrollTo((int)hsv.getScrollY() + 10, (int)hsv.getScrollX());
            }
        });
*/
        rightBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                hsv.scrollTo((int)hsv.getScrollX() + 500, (int)hsv.getScrollY());
            }
        });

        leftBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                hsv.scrollTo((int)hsv.getScrollX() - 500, (int)hsv.getScrollY());
            }
        });

        String[] users = new String[10];
        for (int i = 0; i < 10; i++) {
            users[i] = "user " + (i + 1);
        }

        for (int i = 0; i < users.length; i++) {
            final TextView userId = new TextView(getApplicationContext());
            userId.setText(users[i]);
            ImageView imageView = new ImageView(getApplicationContext());
            linearLayout.addView(userId);
            linearLayout.addView(imageView);
        }
    }

}

