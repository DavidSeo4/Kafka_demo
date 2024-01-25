package com.basic.kafka.Kafka_demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final KafkaJsonProducer kafkaJsonProducer;

    public StudentController(KafkaJsonProducer kafkaJsonProducer) {
        this.kafkaJsonProducer = kafkaJsonProducer;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendInfoStudent(
            @RequestBody Student student
    ){
        kafkaJsonProducer.sendMessage(student);
        return ResponseEntity.ok("Message queued successfully");
    }



}
