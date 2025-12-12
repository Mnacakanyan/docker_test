package com.nairi.docker_test.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumer {

    @KafkaListener(topics = KafkaTopics.USER_CREATED, groupId = KafkaTopics.GROUP_ID)
    public void listen(String message) {
        System.out.println("Received message: " + message);
        processMessage(message);
    }

    private void processMessage(String msg) {
        System.out.println("Processing: " + msg);
    }
}

