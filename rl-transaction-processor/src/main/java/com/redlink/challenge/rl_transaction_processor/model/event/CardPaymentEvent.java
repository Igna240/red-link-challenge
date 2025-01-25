package com.redlink.challenge.rl_transaction_processor.model.event;

public class CardPaymentEvent implements Event {

    private String type;

    @Override
    public String getEventType() {
        return "cardPayment";
    }
}
