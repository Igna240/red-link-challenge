package com.redlink.challenge.rl_transaction_commander.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BankTransactionRequest extends TransactionRequest{

    private String userId;
    private double amount;
    private String currency;
    private String status; // Podría ser un enum
    private String createdAt; // Podría ser LocalDateTime
    private String bankCode;
    private String recipientAccount;
}
