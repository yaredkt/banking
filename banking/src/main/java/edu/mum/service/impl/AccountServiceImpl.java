package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.domian.Account;
import edu.mum.repository.AccountRepository;
import edu.mum.service.AccountService;

public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Account findOne(Long id) {
		
		return accountRepository.findOne(id);
	}

	@Override
	public List<Account> findAll() {
		
		return accountRepository.findAll();
	}

	@Override
	public void save(Account account) {
		
		accountRepository.save(account);
		
	}

	@Override
	public void delete(Long id) {
		
		accountRepository.delete(id);
		
	}

	

}
