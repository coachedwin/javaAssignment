package com.training.nagarro.PendingTransactons.services.implementation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.nagarro.PendingTransactons.entities.Account;
import com.training.nagarro.PendingTransactons.entities.Transaction;
import com.training.nagarro.PendingTransactons.repositories.AccountRepository;
import com.training.nagarro.PendingTransactons.services.AccountServices;

@Service
@Transactional
public class AccountServicesImplementation implements AccountServices {
	
	@Autowired
	private AccountRepository accountRepository;

	public AccountServicesImplementation() {
		// TODO Auto-generated constructor stub
	}
	public Account getAccount(String accountId) {
		Account account =new Account();
		account.setAccountNumber(accountId);
		List<Transaction> transactions=accountRepository.findSuccessTransactionsByAccountNumber(accountId);
		account.setTransactions(transactions);
		return account;
	}

}
