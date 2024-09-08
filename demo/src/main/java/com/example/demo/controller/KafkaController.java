package com.example.demo.controller;

import com.example.demo.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class KafkaController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    private Map<String, Object> customerData;

    @PostMapping("/publish")
    public ResponseEntity<Map<String, String>> publishMessage(@RequestBody Map<String, Object> payload) {
        
        customerData = payload;

        // Send messages to Kafka
        payload.forEach((key, value) -> {
            String message = key + ": " + value.toString();
            kafkaProducerService.sendMessage(message);
        });

        // Save key-value pairs to MongoDB
        kafkaProducerService.saveToMongo(payload);

        return ResponseEntity.ok(Map.of("status", "Data retrieved successfully"));
    }

    @GetMapping("/displayReqID")
    public String displayReqID(Model model) {
        model.addAttribute("customerData", customerData);
        return "reqid";
    }
}
