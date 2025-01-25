package com.redlink.challenge.rl_transaction_commander.service;

import com.redlink.challenge.rl_transaction_commander.model.P2PTransferRequest;
import com.redlink.challenge.rl_transaction_commander.model.TransactionRequest;
import com.redlink.challenge.rl_transaction_commander.model.event.impl.P2PTransferEvent;
import com.redlink.challenge.rl_transaction_commander.service.event.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class P2PTransferCommand implements TransactionCommand<P2PTransferRequest>{

    private final KafkaProducerService producerService;

    @Override
    public String processRequest(P2PTransferRequest request) {
        P2PTransferEvent p2PTransferEvent = P2PTransferEvent.builder()
                .correlationId(UUID.randomUUID().toString())
                .build();

        producerService.sendMessage(p2PTransferEvent);

        return p2PTransferEvent.getCorrelationId();
    }
}
