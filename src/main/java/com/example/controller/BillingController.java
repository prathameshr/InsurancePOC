package com.example.controller;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.PaymentDetails;
import com.example.dto.StatusDTO;
import com.example.service.BillingService;

@RestController
@RequestMapping("/billing")
public class BillingController {
	
	private BillingService billingService;

    private Logger logger=LoggerFactory.getLogger(BillingController.class);

    
    @Autowired
    public BillingController(@Named("billingService") BillingService billingService )
    {
        this.billingService=billingService;
    }

    
    @RequestMapping(value = "/renew",  method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.CREATED)
    public StatusDTO renewInsurance(@RequestBody PaymentDetails paymentDetails)
    {
        return billingService.makePayment(paymentDetails.getCardNumber(), paymentDetails.getCardHolderName(), paymentDetails.getCardExpiryDate(), paymentDetails.getCardBank(), paymentDetails.getPremiumAmount());
    }
}
