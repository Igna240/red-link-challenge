package com.redlink.challenge.rl_transaction_processor.model.event.impl;

import com.redlink.challenge.rl_transaction_processor.model.event.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class P2PTransferEvent implements Event {

    private String correlationId;

    private String senderId;
    private String recipientId;
    private BigDecimal amount;
    private String currency;
    private String status;
    private LocalDateTime createdAt;
    private String note;

    @Override
    public String getEventType() {
        return "p2pTransfer";
    }
}
