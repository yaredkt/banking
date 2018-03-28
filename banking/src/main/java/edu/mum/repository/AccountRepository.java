package edu.mum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.mum.domian.Account;


public interface AccountRepository extends JpaRepository<Account, Long> {

	public Account findByacountNumber(int accountNumber);
	
   public Account findByCustomerSsn(String ssn);
   
   
	
}
