package com.dev.springboot_rabbitmq.consumer;

import com.dev.springboot_rabbitmq.publisher.RabbitMQProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQProducer.class);
    @RabbitListener(queues={"${rabbitmq.queue.name}"})
    public void consume(String message) {
        LOGGER.info(String.format("Received message -> %s", message));
    }
}
