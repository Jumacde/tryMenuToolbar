package com.example.trymenutoolbar.impl;

import android.widget.TextView;

import com.example.trymenutoolbar.TextDisplay;

public class TextDisplay_impl implements TextDisplay {
    private String text;

    public TextDisplay_impl() {
        clearDisplay();
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
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
        setText("");
    }

}
