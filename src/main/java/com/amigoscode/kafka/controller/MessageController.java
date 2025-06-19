package com.amigoscode.kafka.controller;

import com.amigoscode.kafka.model.payload.MessageRequest;
import com.amigoscode.kafka.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/messages")
public record MessageController(MessageService messageService) {
    @PostMapping
    public void publish(@RequestBody final MessageRequest messageRequest) {
        messageService.publish(messageRequest.message());
    }
}