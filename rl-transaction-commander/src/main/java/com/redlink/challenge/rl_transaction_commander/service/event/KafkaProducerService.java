package com.redlink.challenge.rl_transaction_commander.service.event;

import com.redlink.challenge.rl_transaction_commander.model.event.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "transaction";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(Event event) {
        kafkaTemplate.send(TOPIC, event.getEventType(), event.toString());
    }
}
