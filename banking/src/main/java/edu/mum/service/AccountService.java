package edu.mum.service;

import java.util.List;

import edu.mum.domian.Account;

public interface AccountService {
	
	Account findOne(Long id);
	List<Account> findAll();
	void save(Account account);
	void delete(Long id);
	

}
