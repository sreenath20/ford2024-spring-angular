package com.jpa.demojpa.service;

import com.jpa.demojpa.entity.Account;
import com.jpa.demojpa.exceptions.AccountExceptions;

import java.util.List;

public interface AccountService {
    Account createAccount(Account newAccount) throws AccountExceptions;

    Account updateAccount(Account account);

    Account getAccountById(Integer accountId);

    Account deleteAccountById(Integer id);

    List<Account> getAllAccounts();

	List<Account> findAllAccountsContainingName(String queryName);

	Account login(String userEmail, String userPassword)throws AccountExceptions;

	Double fundDeposit(String fromAccountEmail, Double amount)throws AccountExceptions;
}
