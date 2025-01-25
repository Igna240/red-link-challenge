package com.redlink.challenge.rl_transaction_commander.model.event.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.redlink.challenge.rl_transaction_commander.model.event.Event;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BankTransactionEvent implements Event {

    private String correlationId;

    private String userId;
    private Long amount;
    private String currency;
    private String status;
    private LocalDateTime createdAt;
    private String bankCode;
    private String recipientAccount;

    @Override
    public String getEventType() {
        return "bankTransaction";
    }
}
