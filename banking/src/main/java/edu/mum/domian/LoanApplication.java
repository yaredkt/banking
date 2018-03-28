package edu.mum.domian;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import edu.mum.enums.LoanType;

@Entity
public class LoanApplication {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   
	
	private String approval_Status;
   
	@Column(name = "appNumber")
	private Integer application_Number;
	@Column(name = "amount")
    private Double amount_Limit;
	
	@Column(name = "type")
    private LoanType type;
    
	
    private Customer cusomer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApproval_Status() {
		return approval_Status;
	}

	public void setApproval_Status(String approval_Status) {
		this.approval_Status = approval_Status;
	}

	public Integer getApplication_Number() {
		return application_Number;
	}

	public void setApplication_Number(Integer application_Number) {
		this.application_Number = application_Number;
	}

	public Double getAmount_Limit() {
		return amount_Limit;
	}

	public void setAmount_Limit(Double amount_Limit) {
		this.amount_Limit = amount_Limit;
	}

	public LoanType getType() {
		return type;
	}

	public void setType(LoanType type) {
		
		this.type = type;
	}

	public Customer getCusomer() {
		return cusomer;
	}

	public void setCusomer(Customer cusomer) {
		this.cusomer = cusomer;
	}
    
    
    
    
}
