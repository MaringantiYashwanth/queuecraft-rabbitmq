package com.dev.springboot_rabbitmq.controller;

import com.dev.springboot_rabbitmq.dto.User;
import com.dev.springboot_rabbitmq.publisher.RabbitMQJsonProducer;
import com.dev.springboot_rabbitmq.publisher.RabbitMQProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MessageJsonController {

    private RabbitMQJsonProducer jsonProducer;

    private MessageJsonController(RabbitMQJsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user) {
        jsonProducer.sendJsonMessage(user);
        return ResponseEntity.ok("Json message sent to RabbitMQ ...");
    }
}
