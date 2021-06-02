package com.example.service;

import org.apache.log4j.Logger;

import com.example.model.Account;
import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;

/*
 * 
 *  design & performance issues
 *  ----------------------------
 *  
 *  
 *   => tight-coupling b/w dependent & dependency objects
 *   
 *   		--> can't extend with new features
 *   
 *   => too many dependency instances
 *   
 *   		--> too much resource consumption & not responsive
 *   
 *   => Unit Testing not possible
 *   
 *   		--> dev / bug-fix slow
 *   
 *   
 *   
 *   why these issues ?
 *   
 *    => dependent managing it's own dependency
 *    
 *    
 *   solution :
 *   
 *    => don't create , do lookup on factory
 *    
 *    
 *    limitation with factory :
 *    
 *    => factory location tight-coupling
 *    
 *    
 *    best solution:
 *    
 *    => don't create & lookup , inject by container  ( dependency inversion principle )
 *    
 *    
 *    
 *    -------------------------------------------------------------------
 *    
 *    
 *    OO principles a.k.a SOLID principles
 *    
 * 
 *    
 *    Single Responsibility Principle
 *    Open Closed Principle
 *    Liskov Substitution Principle
 *    Interface Segregatio Principle
 *    Dependency Inversion Principle
 *    
 *    
 *    
 *
 * 
 */

public class NEFTTransferService implements TransferService {

	private final static Logger logger = Logger.getLogger("mts");

	private AccountRepository accountRepository;

	public NEFTTransferService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("NEFTTransferService instance created..");
	}

	public void txr(double amount, String fromAccNum, String toAccNum) {
		logger.info("txr initiated...");

		Account fromAccount = accountRepository.loadAccount(fromAccNum);
		Account toAccount = accountRepository.loadAccount(toAccNum);

		// debit

		// credit

		accountRepository.updateAccount(fromAccount);
		accountRepository.updateAccount(toAccount);

		logger.info("txr completed...");
	}

}
