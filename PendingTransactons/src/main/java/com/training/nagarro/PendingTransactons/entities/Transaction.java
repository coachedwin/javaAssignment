package com.training.nagarro.PendingTransactons.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	@Id
	private String transactionId;
	private String status;
	private int amount;
	private String date;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", status=" + status + ", amount=" + amount + ", date="
				+ date + "]";
	}
	
}
