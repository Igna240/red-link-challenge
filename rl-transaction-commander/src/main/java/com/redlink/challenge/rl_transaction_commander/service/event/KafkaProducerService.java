package com.redlink.challenge.rl_transaction_commander.service.event;

import com.redlink.challenge.rl_transaction_commander.model.event.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;


@Slf4j
@Service
public class KafkaProducerService {

    private static final String TOPIC = "transaction";

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    public void sendMessage(Event event) {
        try {
            CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send(TOPIC, event.getEventType(), event);

            future.whenComplete((result, ex) -> {
                if (ex == null) {
                    log.info("Send message: {} Type:{} With offset: {}", event.toString(), event.getEventType(), result.getRecordMetadata().offset());
                } else {
                    log.info("Unable to send message: {} due to: {}", event.toString(), ex.getMessage());
                }
            });
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
    }
}
