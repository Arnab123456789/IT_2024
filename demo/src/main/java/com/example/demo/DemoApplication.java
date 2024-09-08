package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories 
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
		//http://localhost:9898/publish => Send JSON request from Postman
		//http://localhost:9898/displayReqID => Check submission confirmation on browser 
		
//		Steps to start Kafka :
//
//			1. Start Zookeeper:
//				zookeeper-server-start /opt/homebrew/etc/kafka/zookeeper.properties
//
//			2. Start Kafka:
//				kafka-server-start /opt/homebrew/etc/kafka/server.properties
//
//			3. Create topic:
//				kafka-topics --create --topic test --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
//
//			4. Produce messages:
//				kafka-console-producer --topic test --bootstrap-server localhost:9092
//
//			5. Consume messages:(JSON data will be available here )
//				kafka-console-consumer --topic test --from-beginning --bootstrap-server localhost:9092
//		
//			6.List all topics:
//			kafka-topics --list --bootstrap-server localhost:9092
		
		




	}

}
