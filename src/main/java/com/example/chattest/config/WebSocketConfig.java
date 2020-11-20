package com.example.chattest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry){
        registry.addEndpoint("/ws").withSockJS();
        /* 앤드 포인트 등록 */
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry){
        registry.setApplicationDestinationPrefixes("/app");
        /* 도착 경로에 대한 prefix를 설정
        *  /app/경로 형식*/

        registry.enableSimpleBroker("/topic");
        /*메세지 브로커를 등록하는 코드
        * /topic 한명이 message 발행했을 때 해당 토픽을 구독하고 있는 n명에게 메세지를 뿌림
        * /queue 한명이 message 발행했을 때 발행한 한 명에게 다시 정보를 보내는 경우*/
    }
}
