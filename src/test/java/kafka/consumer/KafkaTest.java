package kafka.consumer;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.concurrent.TimeUnit;

import kafka.producer.Producer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RunWith(SpringRunner.class)
@SpringBootTest
//@DirtiesContext
public class KafkaTest {

   //  static final String HELLOWORLD_TOPIC = "helloworld.t";

    //@Autowired
    private Consumer receiver;

    //@Autowired
    private Producer sender;

    @Test
    public void testReceive() throws Exception {
      //  sender.sendMessage("Hello Spring Kafka!");

     //   receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
      //  assertThat(receiver.getLatch().getCount()).isEqualTo(0);
    }
}

