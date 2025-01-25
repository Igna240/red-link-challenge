package com.redlink.challenge.rl_transaction_commander.service;

import com.redlink.challenge.rl_transaction_commander.model.CardPaymentRequest;
import com.redlink.challenge.rl_transaction_commander.model.event.impl.CardPaymentEvent;
import com.redlink.challenge.rl_transaction_commander.service.event.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CardPaymentCommand implements TransactionCommand<CardPaymentRequest> {

    private final KafkaProducerService producerService;

    @Override
    public void processRequest(CardPaymentRequest request) {
        log.info("process card payment event");
        producerService.sendMessage(CardPaymentEvent.builder().type(request.getCardId()).build());
    }
}
