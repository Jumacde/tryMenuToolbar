package com.example.trymenutoolbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trymenutoolbar.impl.TextDisplay_impl;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;
    private TextDisplay textDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu_toolbar);

        textView = findViewById(R.id.textSub);

        textDisplay = new TextDisplay_impl();
        String subText = textDisplay.getText();

        textView.setText(subText);
        backPage(R.id.backButton);

    }

    private void backPage(int id) {
        Button button = findViewById(id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // back page(to the activity_main)
            }
        });
    }


}
