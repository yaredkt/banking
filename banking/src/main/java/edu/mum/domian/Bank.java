package edu.mum.domian;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bank_id")
	private Long id;
	private String Name;
	
	private Long routing_Number;
	
	@OneToMany(mappedBy = "bank", fetch = FetchType.LAZY)
	private List<Address> address;
	
	@ManyToMany(mappedBy = "bank", fetch=FetchType.LAZY)
	private Set<Customer> customer =new HashSet<>();
	
	@ManyToMany(mappedBy = "bank", fetch=FetchType.LAZY)
	private Set<RegulatoryAgencies> regulatoryAgencies = new HashSet<>();
	
	@OneToMany(mappedBy = "bank", fetch=FetchType.LAZY)
	private Set<Account> account = new HashSet<>();
	
	@OneToMany(mappedBy = "bank", fetch=FetchType.LAZY)
	private List<Loan> loan = new ArrayList<>();
	
	

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

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	public Set<RegulatoryAgencies> getRegulatoryAgencies() {
		return regulatoryAgencies;
	}

	public void setRegulatoryAgencies(Set<RegulatoryAgencies> regulatoryAgencies) {
		this.regulatoryAgencies = regulatoryAgencies;
	}

	public Set<Account> getAccount() {
		return account;
	}

	public void setAccount(Set<Account> account) {
		this.account = account;
	}

	public List<Loan> getLoan() {
		return loan;
	}

	public void setLoan(List<Loan> loan) {
		this.loan = loan;
	}
	

}
