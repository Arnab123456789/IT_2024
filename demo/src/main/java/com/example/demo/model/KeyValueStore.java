package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "spring_collection")
public class KeyValueStore {

    @Id
    private String id;
    private Map<String, Object> data;

    // Constructors
    public KeyValueStore() {}

    public KeyValueStore(Map<String, Object> data) {
        this.data = data;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
