package com.jpa.demojpa.service;

import com.jpa.demojpa.dao.AccountRepository;
import com.jpa.demojpa.entity.Account;
import com.jpa.demojpa.exceptions.AccountExceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account createAccount(Account newAccount) throws AccountExceptions{
    	
    	Optional<Account> accountOpt = this.accountRepository.findByEmail(newAccount.getEmail());
    	if(accountOpt.isPresent())
    		throw new AccountExceptions("Email already registered, please re try."+newAccount.getEmail());

    	
        return this.accountRepository.save(newAccount);
    }
    @Override
    public Account updateAccount(Account account) {

        return this.accountRepository.save(account);
    }

    @Override
    public Account getAccountById(Integer accountId) {


        return this.accountRepository.findById(accountId).get();
    }

    @Override
    public Account deleteAccountById(Integer id) {

        Optional<Account> accountOpt = this.accountRepository.findById(id);
        // exception handling
        this.accountRepository.deleteById(id);
        return accountOpt.get();
    }

    @Override
    public List<Account> getAllAccounts() {
        return this.accountRepository.findAll();
    }
	@Override
	public List<Account> findAllAccountsContainingName(String queryName) {
		
		//return this.accountRepository.findByNameContaining(queryName);
		return this.accountRepository.findByNameContainingIgnoreCase(queryName);
	}
	@Override
	public Account login(String userEmail, String userPassword)throws AccountExceptions {
		Optional<Account> accountOpt = this.accountRepository.findByEmail(userEmail);
		if(accountOpt.isEmpty())
			throw new AccountExceptions("Account does not exists for :"+userEmail);
		
		Account foundccount = accountOpt.get();
		if(!foundccount.getPassword().equals(userPassword))
			throw new AccountExceptions("Password does not match");
		
		return foundccount;
	}
	@Override
	public Double fundDeposit(String fromAccountEmail, Double depositAmount)throws AccountExceptions {		
		Optional<Account> accountOpt = this.accountRepository.findByEmail(fromAccountEmail);
		if(accountOpt.isEmpty())
			throw new AccountExceptions("Account does not exists: "+fromAccountEmail);
		
		Account foundAccount  = accountOpt.get();
		foundAccount.setAmount(foundAccount.getAmount()+depositAmount);		
		
		this.accountRepository.save(foundAccount);
		return foundAccount.getAmount();
	}
	
	
	
}
