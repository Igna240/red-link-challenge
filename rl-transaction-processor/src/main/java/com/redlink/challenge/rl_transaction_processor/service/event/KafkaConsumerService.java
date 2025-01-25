package com.redlink.challenge.rl_transaction_processor.service.event;

import com.redlink.challenge.rl_transaction_processor.model.event.Event;
import com.redlink.challenge.rl_transaction_processor.service.EventProcessor;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaConsumerService {

    private final ApplicationContext context;

    @KafkaListener(topics = "transaction")
    public void listen(Event event){
        context.getBean(event.getEventType(), EventProcessor.class);
    }
}
