package com.redlink.challenge.rl_transaction_commander.model.event.impl;

import com.redlink.challenge.rl_transaction_commander.model.event.Event;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class CardPaymentEvent implements Event {

    private String type;

    @Override
    public String getEventType() {
        return "cardPayment";
    }
}
