package com.ecommerce.microcommerce.web.api;


import kafka.consumer.Consumer;
import kafka.objet.Greeting;
import kafka.producer.Producer;
import kafka.producer.ProducerJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;
    private final Consumer consumer;

    @Autowired
    public KafkaController(Producer producer, Consumer consumer) {
        this.producer = producer;
        this.consumer=consumer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message){
        this.producer.sendMessage(message);
    }


}