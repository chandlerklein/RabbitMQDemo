package com.chandler.rabbitmq_demo.listener;

import com.chandler.rabbitmq_demo.domain.Message;
import com.chandler.rabbitmq_demo.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class MessageListener {

    private final MessageService messageService;

    public MessageListener(MessageService messageService) {
        this.messageService = messageService;
    }

    @Bean
    Consumer<Message> input() {
        return messageService::process;
    }
}
