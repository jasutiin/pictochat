package com.jasutiin.controller;

import com.jasutiin.model.Message;
import org.springframework.web.bind.annotation.*;

@RestController // methods in the class return data (JSON, XML, etc.) instead of pages (if that method returns a java object)
public class ChatController {

    @PostMapping("/send")
    public String sendMessage(@RequestBody Message message) {
        return "Message sent: " + message.getContent();
    }

    @GetMapping("/receive")
    public String receiveMessages() {
        return "Messages received";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMessage(@PathVariable Long id) { // @PathVariable annotation binds {id} in url to a variable
        return "Message with ID " + id + " deleted";
    }
}
