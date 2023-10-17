package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.util.Constants;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumerService {

	@Value("${kafka.topic}")
	private String topicName;

	@Value("${spring.kafka.consumer.group-id}")
	private String groupId;

	@KafkaListener(topics = { Constants.TOPIC_NAME }, groupId = Constants.GROUP_ID)
	public void messageListener(String message) {
		log.info("Consumer 1 message is : {}", message);
	}

	@KafkaListener(topics = { Constants.TOPIC_NAME }, groupId = Constants.GROUP_ID)
	public void messageListener1(String message) {
		log.info("Consumer 2 message is : {}", message);
	}

	@KafkaListener(topics = { Constants.TOPIC_NAME }, groupId = Constants.GROUP_ID)
	public void messageListener2(String message) {
		log.info("Consumer 3 message is : {}", message);
	}
	
	@KafkaListener(topics = { Constants.TOPIC_NAME }, groupId = Constants.GROUP_ID)
	public void messageListener3(String message) {
		log.info("Consumer 4 message is : {}", message);
	}

}
