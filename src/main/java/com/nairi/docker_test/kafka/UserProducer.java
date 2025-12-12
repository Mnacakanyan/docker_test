package com.nairi.docker_test.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendUserCreatedMessage(String message) {
        kafkaTemplate.send(KafkaTopics.USER_CREATED, message);
        System.out.println("📤 Sent message to Kafka: " + message);
    }
}
