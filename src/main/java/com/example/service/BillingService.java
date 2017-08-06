package com.example.service;

import com.example.dto.StatusDTO;

public interface BillingService {
    public StatusDTO makePayment(String cardNumber, String cardHolderName, String cardBank, String cardExpiryDate, long amount);

}
