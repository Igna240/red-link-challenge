package com.redlink.challenge.rl_transaction_commander.service;

import com.redlink.challenge.rl_transaction_commander.model.TransactionRequest;

public interface TransactionCommand {

    void processRequest(TransactionRequest request);
}
