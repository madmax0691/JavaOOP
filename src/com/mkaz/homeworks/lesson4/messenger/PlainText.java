package com.mkaz.homeworks.lesson4.messenger;

public class PlainText implements Text {
    private final String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
