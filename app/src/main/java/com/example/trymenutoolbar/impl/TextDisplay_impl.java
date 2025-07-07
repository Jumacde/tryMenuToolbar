package com.example.trymenutoolbar.impl;

import android.widget.TextView;

import com.example.trymenutoolbar.TextDisplay;

public class TextDisplay_impl implements TextDisplay {
    private String text;
    private TextView textView;

    public TextDisplay_impl(TextView textView) {
        this.textView = textView;
        clearDisplay();
    }

    @Override
    public String getText() {
        return textView.getText().toString();
    }

    @Override
    public void setText(String text) {
        textView.setText(text);
    }

    // wrap method
    @Override
    public void callShowText() {
        showText();
    }

    @Override
    public void callClearDisplay() {
        clearDisplay();
    }

    private void showText(){

        setText("Hello");
    }

    private void clearDisplay() {
        this.textView.setText("");
    }

}
