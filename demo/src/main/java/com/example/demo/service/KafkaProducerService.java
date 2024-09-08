package com.example.demo.service;

import com.example.demo.model.KeyValueStore;
import com.example.demo.repository.KeyValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "springTopic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KeyValueRepository keyValueRepository;

    // Send message to Kafka
    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }

    // Save key-value pairs to MongoDB
    public void saveToMongo(Map<String, Object> data) {
        KeyValueStore keyValueStore = new KeyValueStore(data);
        keyValueRepository.save(keyValueStore);
    }
}
