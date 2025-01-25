package com.redlink.challenge.rl_transaction_commander.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CardPaymentRequest implements TransactionRequest{

    private String cardId;
    private String userId;
    private double amount;
    private String currency;
    private String status;
    private String createdAt;
    private Merchant merchant;
    private Integer mccCode;


    @Getter
    public static class Merchant {
        private String name;
        private String merchantId;
    }
}
