package com.example.trymenutoolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.trymenutoolbar.impl.TextDisplay_impl;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private TextDisplay textDisplay;
    private Toolbar toolbar;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textMain);

        textDisplay = new TextDisplay_impl();
        String text = textDisplay.getText();

        setUpButton(R.id.button);
        setUpClearButton(R.id.buttonClear);
        textView.setText(text);
        setUpToolbar();
    }

    private void setUpButton(int id) {
        Button button = findViewById(id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textDisplay.callShowText();
                textView.setText(textDisplay.getText());
                textView.setText(textDisplay.getText());
            }
        });
    }

    private void setUpClearButton(int id) {
        Button clearButton = findViewById(id);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textDisplay.callClearDisplay();
                textView.setText(textDisplay.getText());
            }
        });
    }

    private void setUpToolbar() {
        toolbar = findViewById(R.id.toolbarId);
        setSupportActionBar(toolbar);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        imageButton = findViewById(R.id.menuButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "to the next page", Toast.LENGTH_SHORT).show();
            }
        });
    }



}