package com.jasutiin.chat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration(proxyBeanMethods = false)
public class ChatRouter {

    @Bean
    public RouterFunction<ServerResponse> route(ChatHandler chatHandler) {
        return RouterFunctions
                .route(GET("/join").and(accept(MediaType.APPLICATION_JSON)), chatHandler::join)
                .andRoute(GET("/leave").and(accept(MediaType.APPLICATION_JSON)), chatHandler::join);
    }
}