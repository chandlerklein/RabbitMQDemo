package com.chandler.rabbitmq_demo.service;

import com.chandler.rabbitmq_demo.domain.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final Logger logger = LoggerFactory.getLogger(MessageService.class);

    public void process(Message message) {
        logger.info("MESSAGE: {}", message);
    }
}
