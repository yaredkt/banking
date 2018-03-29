package edu.mum.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import edu.mum.domian.Account;
import edu.mum.repository.AccountRepository;

public class AccountRepositoryImpl implements AccountRepository{
	
	@PersistenceContext
    private EntityManager em;

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<Account> arg0) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> findAll() {
		
		Query query = em.createQuery("SELECT a FROM Account a");
		
		return (List<Account>) query.getResultList();
		
	}

	@Override
	public List<Account> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account getOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Account> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Account> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Account> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long id) {
		
		em.remove(id);
		
	}

	@Override
	public void delete(Account account) {
		
		em.remove(account);
		
	}

	@Override
	public void delete(Iterable<? extends Account> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account findOne(Long arg0) {
		
		Query query = em.createQuery("SELECT a FROM Account a WHERE a.id=:id");
		
		return (Account) query.getSingleResult();
	}

	


	
	@Override
	public Account findByacountNumber(int accountNumber) {
		
		Query query = em.createQuery("SELECT a FROM Account a WHERE a.accountNumber=:accountNumber");
		
		return (Account) query.setParameter("accountNumber", accountNumber).getSingleResult();
	}

	@Override
	public Account findByCustomerSsn(String ssn) {
		
		Query query = em.createQuery("SELECT a FROM Account a Customer c WHERE a.customer.ssn=:ssn");
		
		return (Account) query.setParameter("ssn", ssn).getSingleResult();
	
	}

	@Override
	public <S extends Account> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
