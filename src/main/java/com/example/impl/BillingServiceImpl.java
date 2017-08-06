package com.example.impl;

import javax.inject.Named;

import com.example.dto.StatusDTO;
import com.example.service.BillingService;

@Named("billingService")
public class BillingServiceImpl implements BillingService{


//    private BillingDao billingDao;
    public BillingServiceImpl()
    {
    }

	@Override
	public StatusDTO makePayment(String cardNumber, String cardHolderName, String cardBank, String cardExpiryDate, long amount) {
//		return billingDao.payPremium(cardNumber, cardHolderName, cardBank, cardExpiryDate, amount);
		StatusDTO statusDTO = new StatusDTO();
		
		statusDTO.setMessage("Payment Done Successfully.");
		statusDTO.setStatus("success");
		
		return statusDTO;
	}

}


