package edu.mum.domian;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import edu.mum.enums.AccountType;


@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "account_id")
	private long id;
		
	private int acountNumber;
	private AccountType account;
	private double interestRate;
	private long balance;
	private String status;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name= "account_bank")
	private Bank bank;
	
	@OneToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="account_withdraw")
	private Withdraw withdraw;
	
	@OneToOne(fetch=FetchType.LAZY, cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name="account_deposit")
	private Deposit deposit;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinColumn(name = "account_Customer")
	private Customer customer;
	
	
	public int getAcountNumber() {
		return acountNumber;
	}
	public void setAcountNumber(int acountNumber) {
		this.acountNumber = acountNumber;
	}
	
	public AccountType getAccount() {
		return account;
	}
	public void setAccount(AccountType account) {
		this.account = account;
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
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Withdraw getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(Withdraw withdraw) {
		this.withdraw = withdraw;
	}
	public Deposit getDeposit() {
		return deposit;
	}
	public void setDeposit(Deposit deposit) {
		this.deposit = deposit;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
