package com.amigoscode.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public record MessageService(KafkaTemplate<String, String> kafkaTemplate) {
    public void publish(String message) {
        kafkaTemplate.send("amigoscode", message);
    }
}