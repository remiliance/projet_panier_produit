package com.ecommerce.microcommerce.web.api;


import kafka.objet.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

///////////////
///////////ne marche pas ici.... voir projet kafka : request method POST not supported
///////////////
@RestController
@RequestMapping("producer")
public class KafkaControllerJson {

    @Autowired
    KafkaTemplate<String, Item> KafkaJsontemplate;
    String TOPIC_NAME = "items-topic";

    @RequestMapping(value = "/postItem",consumes = "application/json",produces = "application/json", method=RequestMethod.PUT)
    public String postJsonMessage(@RequestBody Item item){
        KafkaJsontemplate.send(TOPIC_NAME,new Item(1,"Lenovo","Laptop"));
        return "Message published successfully";
    }
}
