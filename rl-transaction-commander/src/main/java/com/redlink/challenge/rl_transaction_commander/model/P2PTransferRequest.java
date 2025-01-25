package com.redlink.challenge.rl_transaction_commander.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class P2PTransferRequest extends TransactionRequest{

    private String senderId;
    private String recipientId;
    private double amount;
    private String currency;
    private String status; // Podría ser un enum
    private String createdAt; // Podría ser LocalDateTime
    private String note;
}
