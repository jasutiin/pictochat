package com.jasutiin.user;

public class User {
    private String username;
    private String chat;

    public User(String username, String chat) {
        this.username = username;
        this.chat = chat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChatRoom() {
        return chat;
    }

    public void setChatRoom(String chat) {
        this.chat = chat;
    }
}
