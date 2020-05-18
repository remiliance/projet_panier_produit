package kafka.producer;

import kafka.objet.Greeting;
import kafka.objet.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


    @Service
    public class ProducerJson {

        private static final Logger logger = LoggerFactory.getLogger(kafka.producer.Producer.class);
        private static final String TOPIC = "blabla";

        @Autowired
        private KafkaTemplate<String, Item> kafkaTemplate;

        public void send(Item car) {
          // logger.info("sending car='{}'", car.toString());
            logger.info(String.format("$$ -> Producing message --> %s",car.getName()));
            kafkaTemplate.send(TOPIC, car);
        }
    }


