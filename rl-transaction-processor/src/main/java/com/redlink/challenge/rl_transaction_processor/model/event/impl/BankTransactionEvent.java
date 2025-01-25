package com.redlink.challenge.rl_transaction_processor.model.event.impl;

import com.redlink.challenge.rl_transaction_processor.model.event.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
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
