package com.amigoscode.kafka.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaListeners {
    @KafkaListener(topics = "amigoscode", groupId = "amigosccodeGroup")
    public void amigoscodeListener(String messagePayload) {
        log.info("[Received] message: {}", messagePayload);
    }
}