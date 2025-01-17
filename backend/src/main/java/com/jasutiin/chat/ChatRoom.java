package com.jasutiin.chat;

import com.jasutiin.user.User;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private String roomName;
    private List<User> users; // to keep track of users, max. 16

    // "roomA", "roomB", "roomC", "roomD"
    public ChatRoom(String roomName) {
        this.roomName = roomName;
        this.users = new ArrayList<>();
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getNumberOfUsers() {
        return users.size();
    }

    public void addUserToChatRoom(User user) {
        users.add(user);
    }

    public void removeUserFromChatRoom(User user) {
        users.remove(user);
    }
}
