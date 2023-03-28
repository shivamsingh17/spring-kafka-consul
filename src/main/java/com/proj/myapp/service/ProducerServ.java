package com.proj.myapp.service;

import com.proj.myapp.config.KafkaProducerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public final class ProducerServ {
    private final KafkaTemplate<String,String> kafkaTemplate;
    @Autowired
    private KafkaProducerConfig kafkaProducerConfig;


    public ProducerServ(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public  void sendMessage(String mg)
    {
        System.out.println("sent");
        kafkaTemplate.send("dev", mg);
    }
}
