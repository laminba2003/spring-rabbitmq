package com.spring.training;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Receiver {

    @RabbitListener(queues = Application.queueName)
    public void receiveMessage(Message message) {
        System.out.println("message received...");
        System.out.println("message from "+message.getFrom());
        System.out.println("message to "+message.getTo());
        System.out.println("message content "+message.getContent());
    }
}
