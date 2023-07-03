package com.training.nagarro.PendingTransactons.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.training.nagarro.PendingTransactons.entities.Account;
import com.training.nagarro.PendingTransactons.entities.Transaction;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

	@Query("SELECT t FROM Account a JOIN a.transactions t WHERE a.accountNumber = :accountNumber AND t.status = 'pending'") 
	List<Transaction> findSuccessTransactionsByAccountNumber(@Param("accountNumber") String accountNumber);
//	@Query("from Account a where a.accountNumber:=pram1 and a.transactions.status:=pram2")
//	Account findByStatus(String pram1,String pram2);

}
