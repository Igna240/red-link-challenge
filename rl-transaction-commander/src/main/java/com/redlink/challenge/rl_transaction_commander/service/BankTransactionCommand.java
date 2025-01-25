package com.redlink.challenge.rl_transaction_commander.service;

import com.redlink.challenge.rl_transaction_commander.model.TransactionRequest;
import org.springframework.stereotype.Service;

@Service
public class BankTransactionCommand implements TransactionCommand {
    @Override
    public void processRequest(TransactionRequest request) {

    }
}
