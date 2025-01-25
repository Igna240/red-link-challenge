package com.redlink.challenge.rl_transaction_commander.model.event.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.redlink.challenge.rl_transaction_commander.model.event.Event;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@type")
@Getter
public class CardPaymentEvent implements Event {

    private String correlationId;

    private String cardId;
    private String userId;
    private BigDecimal amount;
    private String currency;
    private String status;
    private String createdAt;
    private Merchant merchant;
    private Integer mccCode;



    @Builder
    public record Merchant (
            String name,
            String merchantId
    ) {}

    @Override
    public String getEventType() {
        return "cardPayment";
    }
}
