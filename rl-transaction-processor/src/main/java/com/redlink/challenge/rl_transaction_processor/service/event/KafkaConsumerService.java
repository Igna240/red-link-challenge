package com.redlink.challenge.rl_transaction_processor.service.event;

import com.redlink.challenge.rl_transaction_processor.model.event.Event;
import com.redlink.challenge.rl_transaction_processor.model.event.impl.CardPaymentEvent;
import com.redlink.challenge.rl_transaction_processor.service.CardPaymentProcessor;
import com.redlink.challenge.rl_transaction_processor.service.EventProcessor;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class KafkaConsumerService {

    private final ApplicationContext context;

    private final CardPaymentProcessor cardPaymentProcessor;

    @KafkaListener(topics = "transaction", groupId = "transaction_group")
    public void listen(Event event){
        log.info(event.getEventType());
        switch (event.getEventType()) {
            case "cardPayment":
                cardPaymentProcessor.process((CardPaymentEvent) event);
                break;

            default:
                log.info("Unknown even type: " + event.getEventType());
        }
    }
}
