package com.jasutiin.chat;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.jasutiin.user.User;

import org.springframework.stereotype.Component;

@Component
public class ChatRoomService {
    private final Map<String, ChatRoom> chatRooms = new HashMap<>();

    public void createChatRoom(String name) {
        if (!chatRooms.containsKey(name)) {
            chatRooms.put(name, new ChatRoom(name));
        }
    }

    public void joinChatRoom(String roomName, User user) {
        ChatRoom room = chatRooms.get(roomName);
        if (room != null) {
            room.addUserToChatRoom(user);
        }
    }

    public void leaveChatRoom(String roomName, User user) {
        ChatRoom room = chatRooms.get(roomName);
        if (room != null) {
            room.removeUserFromChatRoom(user);
        }
    }

    public Map<String, ChatRoom> getAllChatRooms() {
        return chatRooms;
    }
}
