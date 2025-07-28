package com.dev.springboot_rabbitmq.controller;

import com.dev.springboot_rabbitmq.publisher.RabbitMQProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MessageController {
    private RabbitMQProducer producer;

    public MessageController(RabbitMQProducer producer) {
        this.producer = producer;
    }

    // http://localhost:8080/api/v1/publish?message=help
    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return ResponseEntity.ok("Message sent to RabbitMQ...");
    }
}
