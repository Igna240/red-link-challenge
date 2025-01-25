package com.redlink.challenge.rl_transaction_commander.model.event.impl;

import com.redlink.challenge.rl_transaction_commander.model.event.Event;

public class P2PTransferEvent implements Event {

    private String type;

    @Override
    public String getEventType() {
        return "p2pTransfer";
    }
}
