package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dto.StatusDTO;

public class BillingDao {

	@Autowired
	public BillingDao()
	{
		
	}
	public StatusDTO payPremium(String cardNumber, String cardHolderName,
			String cardBank, String cardExpiryDate, long amount) {
		StatusDTO statusDTO = new StatusDTO();
		
		statusDTO.setMessage("Payment Done Successfully.");
		statusDTO.setStatus("success");
		
		return statusDTO;
	}

}
