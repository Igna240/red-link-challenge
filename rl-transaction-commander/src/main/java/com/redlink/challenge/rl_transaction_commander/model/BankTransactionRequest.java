package com.redlink.challenge.rl_transaction_commander.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class BankTransactionRequest extends TransactionRequest{

    private String userId;
    private Long amount;
    private String currency;
    private String status;
    private LocalDateTime createdAt;
    private String bankCode;
    private String recipientAccount;
}
