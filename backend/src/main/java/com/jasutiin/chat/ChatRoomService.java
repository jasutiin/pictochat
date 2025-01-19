package com.jasutiin.chat;

import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ChatRoomService {
    Map<String, ChatRoom> chatRooms = new HashMap<>();

    ChatRoom roomA = new ChatRoom("roomA");
    ChatRoom roomB = new ChatRoom("roomB");
    ChatRoom roomC = new ChatRoom("roomC");
    ChatRoom roomD = new ChatRoom("roomD");

    public ChatRoomService() {
        chatRooms.put("roomA", roomA);
        chatRooms.put("roomB", roomB);
        chatRooms.put("roomC", roomC);
        chatRooms.put("roomD", roomD);
    }

    ChatRoom getRoomA() {return roomA;}
    ChatRoom getRoomB() {return roomB;}
    ChatRoom getRoomC() {return roomC;}
    ChatRoom getRoomD() {return roomD;}
    Map<String, ChatRoom> getChatRooms() {return chatRooms;}
}
