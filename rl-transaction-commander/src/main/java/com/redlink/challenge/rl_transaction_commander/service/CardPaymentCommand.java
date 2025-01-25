package com.redlink.challenge.rl_transaction_commander.service;

import com.redlink.challenge.rl_transaction_commander.model.CardPaymentRequest;
import com.redlink.challenge.rl_transaction_commander.model.event.impl.CardPaymentEvent;
import com.redlink.challenge.rl_transaction_commander.service.event.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class CardPaymentCommand implements TransactionCommand<CardPaymentRequest> {

    private final KafkaProducerService producerService;

    @Override
    public String processRequest(CardPaymentRequest request) {
        CardPaymentEvent cardPaymentEvent = CardPaymentEvent.builder()
                .correlationId(UUID.randomUUID().toString())
                .cardId(request.getCardId())
                .userId(request.getUserId())
                .amount(request.getAmount())
                .currency(request.getCurrency())
                .status(request.getStatus())
                .createdAt(request.getCreatedAt())
                .merchant(CardPaymentEvent.Merchant.builder()
                        .name(request.getMerchant().getName())
                        .merchantId(request.getMerchant().getMerchantId())
                        .build())
                .mccCode(request.getMccCode())
                .build();
        producerService.sendMessage(cardPaymentEvent);

        return cardPaymentEvent.getCorrelationId();
    }
}
