package com.spring.training;

import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Sender {

    private final RabbitTemplate rabbitTemplate;

    public void sendMessage(Message message) {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(Application.EXCHANGE_MESSAGES, "foo.bar.baz", message);
    }

}
