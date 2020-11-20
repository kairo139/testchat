package com.example.chattest.controller;


import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.lang.Nullable;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.Map;

public class HttpHandshakeInterceptor implements HandshakeInterceptor {

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response,
                                   WebSocketHandler webSocketHandler, Map<String,Object> attributes){
        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest request,ServerHttpResponse response, WebSocketHandler wsHandler,
                               @Nullable Exception exception){

    }
}
