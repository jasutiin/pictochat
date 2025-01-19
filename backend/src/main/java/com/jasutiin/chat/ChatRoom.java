package com.jasutiin.chat;

public class ChatRoom {
    private int numberOfUsers = 0;
    private String name;

    public ChatRoom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int incrementNumberOfUsers() {
        return numberOfUsers++;
    }

    public int decrementNumberOfUsers() {
        return numberOfUsers--;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }
}
