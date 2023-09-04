package com.example.myapplication;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView marqueeText = findViewById(R.id.marqueeText);
        // 为了使TextView可以滚动，需要调用以下方法
        marqueeText.setSelected(true);
    }
}
