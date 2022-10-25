package com.spring.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    static final String EXCHANGE_MESSAGES = "spring-boot-exchange";
    static final String QUEUE_MESSAGES = "spring-boot";
    static final String DLQ_QUEUE_MESSAGES = QUEUE_MESSAGES + ".dlq";;
    static final String DLX_EXCHANGE_MESSAGES = EXCHANGE_MESSAGES + ".dlx";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}