package com.training.nagarro.PendingTransactons.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.nagarro.PendingTransactons.entities.Account;
import com.training.nagarro.PendingTransactons.services.AccountServices;


@RestController
@RequestMapping("/accounts")
public class HomeController {

	public HomeController() {}
	
	@Autowired
	private AccountServices accountService;
	
	@GetMapping("/{accountId}")
	public ResponseEntity<Account> fetchAccount(@PathVariable String accountId)
	{
		
		return ResponseEntity.ok(accountService.getAccount(accountId));
	}
	

}
