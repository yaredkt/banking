package edu.mum.domian;

public class Account {
	
	private long id;
		
	private int acountNumber;
	private String type;
	private double interestRate;
	private long balance;
	private String status;
	public int getAcountNumber() {
		return acountNumber;
	}
	public void setAcountNumber(int acountNumber) {
		this.acountNumber = acountNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	

}
