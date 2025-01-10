package com.jasutiin.model;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private String roomName;
    private List<Message> messages;

    public Chat(String roomName) {
        this.roomName = roomName;
        this.messages = new ArrayList<>();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }
}
