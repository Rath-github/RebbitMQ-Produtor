package com.ufpr.rabbit.produtor.controller;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    private static final String QUEUE_NAME = "message-queue";

    @PostMapping("/send")
    public String sendMessageToQueue(@RequestBody String message) {
        amqpTemplate.convertAndSend(QUEUE_NAME, message);
        return "Message sent to the queue successfully";
    }
}
