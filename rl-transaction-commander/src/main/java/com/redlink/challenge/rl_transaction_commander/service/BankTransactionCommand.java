package com.redlink.challenge.rl_transaction_commander.service;

import com.redlink.challenge.rl_transaction_commander.model.BankTransactionRequest;
import com.redlink.challenge.rl_transaction_commander.model.TransactionRequest;
import com.redlink.challenge.rl_transaction_commander.model.event.impl.BankTransactionEvent;
import com.redlink.challenge.rl_transaction_commander.service.event.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BankTransactionCommand implements TransactionCommand<BankTransactionRequest> {

    private final KafkaProducerService producerService;

    @Override
    public String processRequest(BankTransactionRequest request) {
        BankTransactionEvent bankTransactionEvent = BankTransactionEvent.builder()
                .correlationId(UUID.randomUUID().toString())
                .build();
        producerService.sendMessage(bankTransactionEvent);

        return bankTransactionEvent.getCorrelationId();
    }
}
