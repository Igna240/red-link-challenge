package com.redlink.challenge.rl_transaction_processor.model.event.impl;

import com.redlink.challenge.rl_transaction_processor.model.event.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CardPaymentEvent implements Event {

    private String test;

    @Override
    public String getEventType() {
        return "cardPayment";
    }
}
