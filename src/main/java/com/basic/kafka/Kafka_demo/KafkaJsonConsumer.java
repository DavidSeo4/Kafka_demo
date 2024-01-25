package com.basic.kafka.Kafka_demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {

    @KafkaListener(topics = "StudentsInfo", groupId = "myGroup")
    public void consumeMessage(Student student){
        System.out.println("Receiving info of student: " + student.getFirstname());
    }


}
