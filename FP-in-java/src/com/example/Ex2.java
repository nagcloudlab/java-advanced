package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// 
// declarative style => intention / what + implementation / how

//@FunctionalInterface
//interface Condition {
//	boolean test(Account account);
//}


/*

	var=public boolean test(Account account) {
		return false;
	}
	
	|
	|
	V
	
	
	var=boolean test(Account account) {
		return false;
	}
	
	|
	|
	V


	var=test(Account account) {
		return false;
	}
	
	
	|
	|
	V
	
	
	var=(Account account) {
		return false;
	}
	
	
	|
	|
	V
	
	
	Condition var=(account) -> {
		return false;
	}
	
	|
	|
	V
	
	
	Condition var=account -> {
		return false;
	}
	
	|
	|
	V
	
	// Lambda Expression
	
	Condition var=account -> account.getBalance()==100.00
	
	
*/



class Ex2 {

	static List<Account> accounts = new ArrayList<Account>();

	static {
		accounts.add(new Account("1", 100.00));
		accounts.add(new Account("2", 200.00));
		accounts.add(new Account("3", 300.00));
		accounts.add(new Account("4", 100.00));
		accounts.add(new Account("5", 500.00));
	}

	public static void main(String[] args) {
		
		double balance = 100.00;
		
//		Condition condition = new Condition() {
//			@Override
//			public boolean test(Account account) {
//				return account.getBalance() == balance;
//			}
//		};
		
		// or
		
		System.out.println(filter(account->account.getBalance()==balance));
		
	}

	// implementation to filter accounts
	public static List<Account> filter(Predicate<Account> condition) {
		List<Account> out = new ArrayList<Account>();
		for (Account account : accounts) {
			if (condition.test(account)) {
				out.add(account);
			}
		}
		return out;
	}

}
