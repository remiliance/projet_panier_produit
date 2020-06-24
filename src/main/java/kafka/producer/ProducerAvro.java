package kafka.producer;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;



public class ProducerAvro {
/*
    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerAvro.class);

    @Value("${kafka.topic.avro}")
    private String avroTopic;

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void send(User user) {
        LOGGER.info("sending user='{}'", user.toString());
        kafkaTemplate.send(avroTopic, user);
    }*/
}
