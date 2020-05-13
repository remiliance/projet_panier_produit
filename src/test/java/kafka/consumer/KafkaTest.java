package kafka.consumer;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.concurrent.TimeUnit;


/*

@RunWith(SpringRunner.class)
@SpringBootTest
//@DirtiesContext
//@EmbeddedKafka(partitions = 1) topics = {MicrocommerceApplication.HELLOWORLD_TOPIC})

public class KafkaTest {
    static final String HELLOWORLD_TOPIC = "helloworld.t";

    @Autowired
    private Receiver receiver;

    @Autowired
    private Sender sender;

    @Test
    public void testReceive() throws Exception {
        sender.send("Hello Spring Kafka!");

        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
        assertThat(receiver.getLatch().getCount()).isEqualTo(0);
    }
}*/