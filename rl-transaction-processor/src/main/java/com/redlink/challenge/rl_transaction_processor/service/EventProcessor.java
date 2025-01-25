package com.redlink.challenge.rl_transaction_processor.service;

public interface EventProcessor<T>{
    void process(T event);
}
