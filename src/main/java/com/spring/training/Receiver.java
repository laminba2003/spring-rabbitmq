package com.spring.training;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import javax.validation.Valid;

@Service
public class Receiver {

    @RabbitListener(queues = Application.QUEUE_MESSAGES)
    public void receiveMessage(@Payload @Valid Message message) {
        System.out.println("message received...");
        System.out.println("message from "+message.getFrom());
        System.out.println("message to "+message.getTo());
        System.out.println("message content "+message.getContent());
    }
}
