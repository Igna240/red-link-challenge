package com.redlink.challenge.rl_transaction_commander.model.event.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.redlink.challenge.rl_transaction_commander.model.event.Event;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@type")
public class CardPaymentEvent implements Event {

    private String test;

    @Override
    public String getEventType() {
        return "cardPayment";
    }
}
