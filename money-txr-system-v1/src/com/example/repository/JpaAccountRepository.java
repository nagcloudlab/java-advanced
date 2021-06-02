package com.example.repository;

import org.apache.log4j.Logger;

import com.example.model.Account;

public class JpaAccountRepository implements AccountRepository {

	private final static Logger logger = Logger.getLogger("mts");

	public JpaAccountRepository() {
		logger.info("JPAAccountRepository instance created..");
	}

	public Account loadAccount(String accNum) {
		logger.info("loading account " + accNum);
		// ...
		return new Account();
	}

	public Account updateAccount(Account account) {
		logger.info("updating account " + account.getNum());
		// ...
		return account;
	}

}
