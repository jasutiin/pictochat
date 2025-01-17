package com.jasutiin.chat;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import com.jasutiin.user.User;

@Component
public class ChatHandler {

    private final ChatRoomService chatRoomService;

    public ChatHandler(ChatRoomService chatRoomService) {
        this.chatRoomService = chatRoomService;
    }

    public Mono<ServerResponse> join(ServerRequest request) {
        String roomName = request.queryParam("room").orElse("");
        return request.bodyToMono(User.class)
                .flatMap(user -> {
                    chatRoomService.joinChatRoom(roomName, user);
                    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                            .bodyValue("User " + user.getUsername() + " joined room " + roomName);
                });
    }

    public Mono<ServerResponse> leave(ServerRequest request) {
        String roomName = request.queryParam("room").orElse("");
        return request.bodyToMono(User.class)
                .flatMap(user -> {
                    chatRoomService.leaveChatRoom(roomName, user);
                    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                            .bodyValue("Participant " + user.getUsername() + " left room " + roomName);
                });
    }
}
