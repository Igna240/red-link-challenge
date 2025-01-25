package com.redlink.challenge.rl_transaction_commander.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class CardPaymentRequest extends TransactionRequest{

    private String cardId;
    private String userId;
    private BigDecimal amount;
    private String currency;
    private String status;
    private String createdAt;
    private Merchant merchant;
    private Integer mccCode;


    @Getter
    @AllArgsConstructor
    public static class Merchant {
        private String name;
        private String merchantId;
    }
}
