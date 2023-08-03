package org.rba.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Publisher {

    private final Logger logger = LoggerFactory.getLogger(Publisher.class);

    @Value("${rba.producer.delayms:1000}")
    private long delay;

    @Autowired
    private RandomGenerator random;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @EventListener(ApplicationReadyEvent.class)
    public void infiniteLoop() throws InterruptedException {
        while (true) {
            int data = random.getNext();
            logger.info("sending: {}", data);
            kafkaTemplate.send("rba-data", data);

            Thread.sleep(delay);
        }
    }

}
