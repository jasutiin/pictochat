package com.jasutiin.message;

public class Message {
    private String username;
    private String content;
    private String messageType; // either connect, disconnect, or message

    public Message(String username, String content, String messageType) {
        this.username = username;
        this.content = content;
        this.messageType = messageType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
