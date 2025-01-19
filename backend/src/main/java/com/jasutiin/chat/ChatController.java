package com.jasutiin.chat;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ChatController {
    ChatRoomService chatRooms = new ChatRoomService();

    @PostMapping("/incrementCount")
    public ChatRoom incrementCount(@RequestBody ChatRequest chatRequest) throws Exception {
        String chat = chatRequest.getChat();

        switch (chat) {
            case "roomA":
                if (chatRooms.getRoomA().getNumberOfUsers() != 16)
                    chatRooms.getRoomA().incrementNumberOfUsers();
                return chatRooms.getRoomA();
            case "roomB":
                if (chatRooms.getRoomB().getNumberOfUsers() != 16)
                    chatRooms.getRoomB().incrementNumberOfUsers();
                return chatRooms.getRoomB();
            case "roomC":
                if (chatRooms.getRoomC().getNumberOfUsers() != 16)
                    chatRooms.getRoomC().incrementNumberOfUsers();
                return chatRooms.getRoomC();
            case "roomD":
                if (chatRooms.getRoomD().getNumberOfUsers() != 16)
                    chatRooms.getRoomD().incrementNumberOfUsers();
                return chatRooms.getRoomD();
            default:
                throw new IllegalArgumentException("Invalid room name");
        }
    }

    @PostMapping("/decrementCount")
    public ChatRoom decrementCount(@RequestBody ChatRequest chatRequest) throws Exception {
        String chat = chatRequest.getChat();

        switch (chat) {
            case "roomA":
                if (chatRooms.getRoomA().getNumberOfUsers() != 0)
                    chatRooms.getRoomA().decrementNumberOfUsers();
                return chatRooms.getRoomA();
            case "roomB":
                if (chatRooms.getRoomA().getNumberOfUsers() != 0)
                    chatRooms.getRoomB().decrementNumberOfUsers();
                return chatRooms.getRoomB();
            case "roomC":
                if (chatRooms.getRoomA().getNumberOfUsers() != 0)
                    chatRooms.getRoomC().decrementNumberOfUsers();
                return chatRooms.getRoomC();
            case "roomD":
                if (chatRooms.getRoomA().getNumberOfUsers() != 0)
                    chatRooms.getRoomD().decrementNumberOfUsers();
                return chatRooms.getRoomD();
            default:
                throw new IllegalArgumentException("Invalid room name");
        }
    }

    @GetMapping("/getCount")
    public Map<String, ChatRoom> getCount() throws Exception {
        return chatRooms.getChatRooms();
    }
}
