package edu.mum.domian;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private String id;
	private String name;
    private String ssn;
    
    @OneToMany(mappedBy="customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<LoanApplication> loanApplications;
    
    @OneToOne(mappedBy="customer", fetch= FetchType.EAGER, cascade = CascadeType.ALL)
    private Address address;
    
    @OneToMany(mappedBy="customer", fetch= FetchType.LAZY, cascade= {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Account> account = new ArrayList<>();
    
    @ManyToMany(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
    @JoinTable(name="CustomerBank", joinColumns= {@JoinColumn(name="Customer")}, inverseJoinColumns = {@JoinColumn(name="Bank")})
    private List<Bank> bank = new ArrayList<>();
    
    @OneToMany(mappedBy="customer",fetch = FetchType.LAZY, cascade= CascadeType.ALL )
    private Set<Loan> loan = new HashSet<>();
    
    @OneToMany(mappedBy="customer", fetch= FetchType.LAZY, cascade= {CascadeType.MERGE, CascadeType.PERSIST})
    private Set<LoanApplication> loanApplication = new HashSet<>();
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<LoanApplication> getLoanApplications() {
		return loanApplications;
	}

	public void setLoanApplications(List<LoanApplication> loanApplications) {
		this.loanApplications = loanApplications;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}
    
    
	

}
