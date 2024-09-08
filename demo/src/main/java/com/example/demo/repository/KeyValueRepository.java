package com.example.demo.repository;

import com.example.demo.model.KeyValueStore;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KeyValueRepository extends MongoRepository<KeyValueStore, String> {
}
