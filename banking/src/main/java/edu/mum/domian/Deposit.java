package edu.mum.domian;

import java.util.Date;

import edu.mum.enums.AccountType;

public class Deposit {
	
	
	private long id;
	
	private double amount;
	private Date depositDate;
	private int transactionId;
	private Account account;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDepositDate() {
		return depositDate;
	}
	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccountType(Account account) {
		this.account = account;
	}
	
	
	

}
