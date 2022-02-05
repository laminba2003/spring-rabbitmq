package com.spring.training;

import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Runner implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;
    private final Receiver receiver;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Sending message...");
        Message message = new Message("laminba2003@gmail.com","moussa@gmail.com","this is a test");
        rabbitTemplate.convertAndSend(Application.topicExchangeName, "foo.bar.baz", message);
    }

}