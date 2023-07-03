package com.training.nagarro.PendingTransactons.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}
	@Id
	private String accountNumber;
	@OneToMany
	private List<Transaction> transactions;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions2) {
		this.transactions = transactions2;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", transactions=" + transactions + "]";
	}

	
	
}
