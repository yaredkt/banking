package edu.mum.domian;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class RegulatoryAgencies {
	
	private long id;
		
	private String type;
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
    @JoinTable(name="BankRequlatoryAgencies", joinColumns= {@JoinColumn(name="Bank")}, inverseJoinColumns = {@JoinColumn(name="RegulatoryAgencies")})
	private List<Bank> bank = new ArrayList<>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Bank> getBanks() {
		return bank;
	}
	public void setBanks(List<Bank> banks) {
		this.bank = banks;
	}
	

}
