package com.example.dto;

public class PaymentDetails {
	
	private String cardNumber;
	private String cardBank;
	private String cardExpiryDate;
	private String cardHolderName;
	private long premiumAmount;
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardBank() {
		return cardBank;
	}
	public void setCardBank(String cardBank) {
		this.cardBank = cardBank;
	}
	public String getCardExpiryDate() {
		return cardExpiryDate;
	}
	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public long getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(long premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

}
