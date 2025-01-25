package com.redlink.challenge.rl_transaction_processor.service;

import com.redlink.challenge.rl_transaction_processor.model.event.CardPaymentEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service("cardPayment")
public class CardPaymentProcessor implements EventProcessor<CardPaymentEvent> {

    @Override
    public void process(CardPaymentEvent event) {
        log.info("event saved");
    }
}
