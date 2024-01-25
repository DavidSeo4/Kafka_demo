package com.basic.kafka.Kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic studentsTopic(){
        return TopicBuilder
                .name("StudentsInfo")
                .build();
    }

}
