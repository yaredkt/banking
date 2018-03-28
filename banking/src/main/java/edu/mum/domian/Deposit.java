package edu.mum.domian;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import edu.mum.enums.AccountType;
@Entity
public class Deposit {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "deposit_id")
	private long id;
	
	private double amount;
	private Date depositDate;
	private int transactionId;
	
//	@OneToOne(fetch = FetchType.EAGER, cascade= CascadeType.ALL)	
//	@JoinColum()
//	private Account account;
	
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
//	public Account getAccount() {
//		return account;
//	}
//	public void setAccountType(Account account) {
//		this.account = account;
//	}
//	
	
}
