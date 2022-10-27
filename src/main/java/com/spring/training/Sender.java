package com.spring.training;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class Sender {

    final RabbitTemplate template;

    public void sendMessage(Message message) {
        log.info("Sending message : {}", message);
        template.convertAndSend(ApplicationConfig.EXCHANGE_MESSAGES, "foo.bar.baz", message);
    }

}
