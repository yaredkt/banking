package edu.mum.domian;

import java.util.List;

public class Bank {

	private Long id;
	private String Name;
	
	private Long routing_Number;
	
	private List<Address> address;
	
	private List<Customer> customer;
	
	private List<RegulatoryAgencies> regulatoryAgencies;
	
	private List<Account> account;
	
	private List<Loan> loan;
	
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Long getRouting_Number() {
		return routing_Number;
	}

	public void setRouting_Number(Long routing_Number) {
		this.routing_Number = routing_Number;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public List<RegulatoryAgencies> getRegulatoryAgencies() {
		return regulatoryAgencies;
	}

	public void setRegulatoryAgencies(List<RegulatoryAgencies> regulatoryAgencies) {
		this.regulatoryAgencies = regulatoryAgencies;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	public List<Loan> getLoan() {
		return loan;
	}

	public void setLoan(List<Loan> loan) {
		this.loan = loan;
	}
	
	
	
}
