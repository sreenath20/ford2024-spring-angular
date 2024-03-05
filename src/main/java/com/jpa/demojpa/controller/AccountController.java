package com.jpa.demojpa.controller;

import com.jpa.demojpa.dto.FundTransferDto;
import com.jpa.demojpa.dto.LoginDto;
import com.jpa.demojpa.entity.Account;
import com.jpa.demojpa.exceptions.AccountExceptions;
import com.jpa.demojpa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	// Api to Account registration with email
	@PostMapping("account")
	public Account createAccount(@RequestBody Account account) throws AccountExceptions {
		return this.accountService.createAccount(account);
	}

//	// Api for Account login
//	@PostMapping("account/login")
//	public Account userAccountLogin(@RequestBody LoginDto loginDto) {
//		return this.accountService.login(loginDto.getUserEmail(), loginDto.getUserPassword());
//	}

	@PutMapping("account")
	public Account updateAccount(@RequestBody Account account) {
		return this.accountService.updateAccount(account);
	}

	@GetMapping("account/{id}")
	public Account getAccountById(@PathVariable("id") Integer accountId) {
		return this.accountService.getAccountById(accountId);
	}

	@DeleteMapping("account/{id}")
	public Account deleteAccountById(@PathVariable Integer id) {
		return this.accountService.deleteAccountById(id);
	}

	@GetMapping("accounts")
	public List<Account> getAllAccounts() {
		return this.accountService.getAllAccounts();
	}

	@GetMapping("account/name/{name}")
	public List<Account> findAllAccountsByName(@PathVariable("name") String queryName) {
		return this.accountService.findAllAccountsContainingName(queryName);
	}
	
	@PutMapping("fund/account")
	public Double addFundsToAccount(@RequestBody FundTransferDto fundTransferDto) throws AccountExceptions {
		return this.accountService.fundDeposit(fundTransferDto.getFromAccountEmail(),fundTransferDto.getAmount());
	}

}
