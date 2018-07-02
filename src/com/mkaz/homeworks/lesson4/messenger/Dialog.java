package com.mkaz.homeworks.lesson4.messenger;

import java.util.ArrayList;

public class Dialog {
    private final ArrayList<Message> messages = new ArrayList<>();

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void showDialog() {
        for (Message message : messages) {
            System.out.println(message.getAuthor());
            System.out.println(message.getContent());
            System.out.println(message.getDate());
        }
    }
}
