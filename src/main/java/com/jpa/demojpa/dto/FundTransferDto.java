package com.jpa.demojpa.dto;

public class FundTransferDto {

	private String fromAccountEmail;
	private String toAccountEmail;
	private Double amount;
	
	public FundTransferDto() {
		super();
	}
	public String getFromAccountEmail() {
		return fromAccountEmail;
	}
	public void setFromAccountEmail(String fromAccountEmail) {
		this.fromAccountEmail = fromAccountEmail;
	}
	public String getToAccountEmail() {
		return toAccountEmail;
	}
	public void setToAccountEmail(String toAccountEmail) {
		this.toAccountEmail = toAccountEmail;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
