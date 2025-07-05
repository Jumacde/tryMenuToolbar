package com.example.trymenutoolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trymenutoolbar.impl.TextDisplay_impl;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private TextDisplay textDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textDisplay = new TextDisplay_impl();

        textView = findViewById(R.id.text);
        setUpButton(R.id.button);

    }

    private void setUpButton(int id) {
        Button button = findViewById(id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textDisplay.callShowText();
            }
        });

    }
}