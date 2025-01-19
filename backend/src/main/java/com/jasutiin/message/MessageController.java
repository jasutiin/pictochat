package com.jasutiin.message;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @MessageMapping("/joinA")
    @SendTo("/topic/roomA")
    public Message messageRoomA(Message message) throws Exception {
        return message;
    }

    @MessageMapping("/joinB")
    @SendTo("/topic/roomB")
    public Message messageRoomB(Message message) throws Exception {
        return message;
    }

    @MessageMapping("/joinC")
    @SendTo("/topic/roomC")
    public Message messageRoomC(Message message) throws Exception {
        return message;
    }

    @MessageMapping("/joinD")
    @SendTo("/topic/roomD")
    public Message messageRoomD(Message message) throws Exception {
        return message;
    }
}
