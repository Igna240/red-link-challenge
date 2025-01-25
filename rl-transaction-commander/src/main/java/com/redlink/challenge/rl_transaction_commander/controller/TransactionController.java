package com.redlink.challenge.rl_transaction_commander.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.redlink.challenge.rl_transaction_commander.model.BankTransactionRequest;
import com.redlink.challenge.rl_transaction_commander.model.CardPaymentRequest;
import com.redlink.challenge.rl_transaction_commander.model.P2PTransferRequest;
import com.redlink.challenge.rl_transaction_commander.model.TransactionRequest;
import com.redlink.challenge.rl_transaction_commander.service.BankTransactionCommand;
import com.redlink.challenge.rl_transaction_commander.service.CardPaymentCommand;
import com.redlink.challenge.rl_transaction_commander.service.P2PTransferCommand;
import com.redlink.challenge.rl_transaction_commander.service.TransactionCommand;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final CardPaymentCommand cardPaymentCommand;
    private final BankTransactionCommand bankTransactionCommand;
    private final P2PTransferCommand p2PTransferCommand;

    @Autowired
    public TransactionController(CardPaymentCommand cardPaymentCommand, BankTransactionCommand bankTransactionCommand, P2PTransferCommand p2PTransferCommand) {
        this.cardPaymentCommand = cardPaymentCommand;
        this.bankTransactionCommand = bankTransactionCommand;
        this.p2PTransferCommand = p2PTransferCommand;
    }

    @PostMapping("/card")
    public ResponseEntity<String> createCardPayment(
            @RequestBody CardPaymentRequest body
            ){

        return new ResponseEntity<>( "Transaction processed, correlationId: "
                + cardPaymentCommand.processRequest(body), HttpStatus.OK);

    }

    @PostMapping("/bank")
    public ResponseEntity<String> createBankTransaction(
            @RequestBody BankTransactionRequest body
    ){

        bankTransactionCommand.processRequest(body);

        return new ResponseEntity<>("Transaction processed", HttpStatus.OK);
    }

    @PostMapping("/p2p")
    public ResponseEntity<String> createP2PTransaction(
            @RequestBody P2PTransferRequest body
    ){

        p2PTransferCommand.processRequest(body);

        return new ResponseEntity<>("Transaction processed", HttpStatus.OK);
    }
}
