package com.redlink.challenge.rl_transaction_processor.model.event.impl;

import com.redlink.challenge.rl_transaction_processor.model.event.Event;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@NoArgsConstructor
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
