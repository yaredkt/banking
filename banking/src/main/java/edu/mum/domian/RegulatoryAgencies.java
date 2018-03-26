package edu.mum.domian;

import java.util.List;

public class RegulatoryAgencies {
	
	private long id;
		
	private String type;
	private String name;
	private List<Bank> banks;
	
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
		return banks;
	}
	public void setBanks(List<Bank> banks) {
		this.banks = banks;
	}
	

}
