package kafka.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;

@Service
public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);


    private CountDownLatch latch = new CountDownLatch(1);

    @KafkaListener(topics = "blabla")
    public void consume(String message){
        logger.info(String.format("$$ -> Consumed Message -> %s",message));
    }


    public CountDownLatch getLatch() {
        return latch;
    }

}